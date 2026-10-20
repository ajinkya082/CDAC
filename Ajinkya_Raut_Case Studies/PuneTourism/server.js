
const http = require("http");
const fs = require("fs");
const path = require("path");
const crypto = require("crypto");
const { URL } = require("url");

const PORT = 3000;
const ROOT = __dirname;
const DATA_DIR = path.join(ROOT, "data");
const XML_FILE = path.join(DATA_DIR, "users.xml");

// Create the data folder and XML file if they don't exist.
if (!fs.existsSync(DATA_DIR)) {
    fs.mkdirSync(DATA_DIR, { recursive: true });
}

if (!fs.existsSync(XML_FILE)) {
    fs.writeFileSync(
        XML_FILE,
        '<?xml version="1.0" encoding="UTF-8"?>\n<users>\n</users>\n',
        "utf8"
    );
}

const MIME = {
    ".html": "text/html; charset=utf-8",
    ".css": "text/css; charset=utf-8",
    ".js": "text/javascript; charset=utf-8",
    ".xml": "application/xml; charset=utf-8",
    ".json": "application/json; charset=utf-8",
    ".svg": "image/svg+xml",
    ".png": "image/png",
    ".jpg": "image/jpeg",
    ".jpeg": "image/jpeg",
    ".ico": "image/x-icon"
};

// Send API responses.
function send(res, status, data, type = "application/json; charset=utf-8") {
    res.writeHead(status, {
        "Content-Type": type,
        "X-Content-Type-Options": "nosniff",
        "Cache-Control": "no-store"
    });

    if (Buffer.isBuffer(data)) {
        res.end(data);
    } else if (typeof data === "string") {
        res.end(data);
    } else {
        res.end(JSON.stringify(data));
    }
}

// Escape special XML characters before storing user data.
function escapeXml(value) {
    return String(value)
        .replace(/&/g, "&amp;")
        .replace(/</g, "&lt;")
        .replace(/>/g, "&gt;")
        .replace(/"/g, "&quot;")
        .replace(/'/g, "&apos;");
}

// Decode XML entities when reading user data.
function unescapeXml(value) {
    return value
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">")
        .replace(/&quot;/g, '"')
        .replace(/&apos;/g, "'")
        .replace(/&amp;/g, "&");
}

// Read registered users from users.xml.
function readUsers() {
    const xml = fs.readFileSync(XML_FILE, "utf8");
    const users = [];

    const blocks = xml.match(/<user>[\s\S]*?<\/user>/g) || [];

    for (const block of blocks) {
        const get = (tag) => {
            const match = block.match(
                new RegExp("<" + tag + ">([\\s\\S]*?)</" + tag + ">")
            );

            return match ? unescapeXml(match[1]) : "";
        };

        users.push({
            name: get("name"),
            email: get("email"),
            salt: get("salt"),
            passwordHash: get("passwordHash")
        });
    }

    return users;
}

// Save users to users.xml.
function writeUsers(users) {
    const rows = users.map((user) => {
        return `  <user>
    <name>${escapeXml(user.name)}</name>
    <email>${escapeXml(user.email)}</email>
    <salt>${escapeXml(user.salt)}</salt>
    <passwordHash>${escapeXml(user.passwordHash)}</passwordHash>
  </user>`;
    }).join("\n");

    const xml = `<?xml version="1.0" encoding="UTF-8"?>
<users>
${rows}
</users>
`;

    fs.writeFileSync(XML_FILE, xml, "utf8");
}

// Read JSON request data.
function readBody(req) {
    return new Promise((resolve, reject) => {
        let body = "";

        req.on("data", (chunk) => {
            body += chunk.toString();

            if (body.length > 10000) {
                reject(new Error("Request too large"));
                req.destroy();
            }
        });

        req.on("end", () => {
            try {
                resolve(JSON.parse(body || "{}"));
            } catch {
                reject(new Error("Invalid JSON"));
            }
        });

        req.on("error", reject);
    });
}

// Hash passwords using Node.js crypto.
function passwordHash(password, salt) {
    return crypto.scryptSync(password, salt, 64).toString("hex");
}

// Compare password hashes safely.
function safeEqual(a, b) {
    if (typeof a !== "string" || typeof b !== "string") {
        return false;
    }

    if (!/^[a-f0-9]+$/i.test(a) || !/^[a-f0-9]+$/i.test(b)) {
        return false;
    }

    const aa = Buffer.from(a, "hex");
    const bb = Buffer.from(b, "hex");

    return aa.length === bb.length &&
        aa.length > 0 &&
        crypto.timingSafeEqual(aa, bb);
}

const server = http.createServer(async (req, res) => {
    let url;

    try {
        url = new URL(
            req.url,
            `http://${req.headers.host || "localhost"}`
        );
    } catch {
        return send(res, 400, {
            success: false,
            message: "Invalid request URL."
        });
    }

    // REGISTER API
    if (req.method === "POST" && url.pathname === "/api/register") {
        try {
            const { name, email, password } = await readBody(req);

            if (
                typeof name !== "string" ||
                !/^[\p{L}][\p{L} .'-]{0,59}$/u.test(name.trim())
            ) {
                return send(res, 400, {
                    success: false,
                    message: "Enter a valid name."
                });
            }

            if (
                typeof email !== "string" ||
                !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email.trim())
            ) {
                return send(res, 400, {
                    success: false,
                    message: "Enter a valid email address."
                });
            }

            if (
                typeof password !== "string" ||
                password.length < 8
            ) {
                return send(res, 400, {
                    success: false,
                    message: "Password must contain at least 8 characters."
                });
            }

            const users = readUsers();
            const normalizedEmail = email.trim().toLowerCase();

            const alreadyRegistered = users.some(
                (user) => user.email.toLowerCase() === normalizedEmail
            );

            if (alreadyRegistered) {
                return send(res, 409, {
                    success: false,
                    message: "This email is already registered. Please log in."
                });
            }

            const salt = crypto.randomBytes(16).toString("hex");

            users.push({
                name: name.trim(),
                email: normalizedEmail,
                salt,
                passwordHash: passwordHash(password, salt)
            });

            writeUsers(users);

            return send(res, 201, {
                success: true,
                message: "Registration successful! You can now log in."
            });
        } catch (err) {
            console.error("Registration error:", err.message);

            const status = err.message === "Request too large" ? 413 : 400;

            return send(res, status, {
                success: false,
                message: err.message === "Request too large"
                    ? err.message
                    : "Could not process registration."
            });
        }
    }

    // LOGIN API
    if (req.method === "POST" && url.pathname === "/api/login") {
        try {
            const { email, password } = await readBody(req);

            if (
                typeof email !== "string" ||
                typeof password !== "string"
            ) {
                return send(res, 400, {
                    success: false,
                    message: "Enter your email and password."
                });
            }

            const users = readUsers();

            const user = users.find(
                (item) =>
                    item.email.toLowerCase() === email.trim().toLowerCase()
            );

            if (
                !user ||
                !user.salt ||
                !user.passwordHash ||
                !safeEqual(
                    passwordHash(password, user.salt),
                    user.passwordHash
                )
            ) {
                return send(res, 401, {
                    success: false,
                    message: "Email or password is incorrect. Register first if you are new."
                });
            }

            return send(res, 200, {
                success: true,
                message: `Welcome back, ${user.name}! Enjoy exploring Pune.`
            });
        } catch (err) {
            console.error("Login error:", err.message);

            return send(res, 400, {
                success: false,
                message: "Could not process login."
            });
        }
    }

    // Serve the website and its static files.
    if (req.method !== "GET" && req.method !== "HEAD") {
        return send(res, 405, "Method Not Allowed", "text/plain; charset=utf-8");
    }

    let pathname;

    try {
        pathname = decodeURIComponent(url.pathname);
    } catch {
        return send(res, 400, "Invalid URL", "text/plain; charset=utf-8");
    }

    if (pathname === "/") {
        pathname = "/index.html";
    }

    const filePath = path.resolve(ROOT, "." + pathname);

    // Prevent access outside the project directory.
    if (
        !filePath.startsWith(ROOT + path.sep) ||
        filePath === XML_FILE ||
        filePath.startsWith(DATA_DIR + path.sep)
    ) {
        return send(res, 403, "Forbidden", "text/plain; charset=utf-8");
    }

    fs.readFile(filePath, (err, content) => {
        if (err) {
            return send(
                res,
                404,
                "File not found",
                "text/plain; charset=utf-8"
            );
        }

        const type =
            MIME[path.extname(filePath).toLowerCase()] ||
            "application/octet-stream";

        res.writeHead(200, {
            "Content-Type": type,
            "X-Content-Type-Options": "nosniff",
            "Cache-Control": "no-store"
        });

        // Send the actual file bytes, NOT JSON.stringify(Buffer).
        if (req.method === "HEAD") {
            return res.end();
        }

        res.end(content);
    });
});

server.listen(PORT, () => {
    console.log(`Pune Tourism is running at http://localhost:${PORT}`);
    console.log(`XML user data: ${XML_FILE}`);
});
