
const express = require("express");
const fs = require("fs");
const path = require("path");
const { XMLParser, XMLBuilder } = require("fast-xml-parser");

const app = express();
const PORT = 3000;

const booksFile = path.join(__dirname, "books.xml");
const dataDir = path.join(__dirname, "data");
const ordersFile = path.join(dataDir, "orders.xml");

const parser = new XMLParser({
    ignoreAttributes: false,
    isArray: (name) => name === "book" || name === "order"
});

const builder = new XMLBuilder({
    format: true,
    ignoreAttributes: false
});

if (!fs.existsSync(dataDir)) {
    fs.mkdirSync(dataDir, { recursive: true });
}

if (!fs.existsSync(ordersFile)) {
    fs.writeFileSync(
        ordersFile,
        '<?xml version="1.0" encoding="UTF-8"?>\n<orders></orders>'
    );
}

app.use(express.json());
app.use(express.static(path.join(__dirname, "public")));

app.get("/api/books", (req, res) => {
    try {
        const xml = fs.readFileSync(booksFile, "utf8");
        const data = parser.parse(xml);
        res.json(data.books.book || []);
    } catch (error) {
        res.status(500).json({ message: "Unable to load books." });
    }
});

app.post("/api/orders", (req, res) => {
    try {
        const { customerName, address, phone, bookId } = req.body;

        if (
            typeof customerName !== "string" ||
            !/^[\p{L}][\p{L}\s.'-]*$/u.test(customerName.trim())
        ) {
            return res.status(400).json({
                message: "Enter a valid customer name."
            });
        }

        if (
            typeof address !== "string" ||
            address.trim().length < 5
        ) {
            return res.status(400).json({
                message: "Enter a valid contact address."
            });
        }

        if (
            typeof phone !== "string" ||
            !/^[6-9]\d{9}$/.test(phone)
        ) {
            return res.status(400).json({
                message: "Enter a valid 10-digit Indian mobile number."
            });
        }

        const booksData = parser.parse(
            fs.readFileSync(booksFile, "utf8")
        );

        const books = booksData.books.book || [];

        const selectedBook = books.find(
            book => String(book.id) === String(bookId)
        );

        if (!selectedBook) {
            return res.status(400).json({
                message: "Please select a valid book."
            });
        }

        const ordersData = parser.parse(
            fs.readFileSync(ordersFile, "utf8")
        );

        const orders = ordersData.orders.order || [];

        const newOrder = {
            orderId: Date.now().toString(),
            customerName: customerName.trim(),
            address: address.trim(),
            phone,
            bookId: String(selectedBook.id),
            bookName: String(selectedBook.name),
            orderDate: new Date().toISOString()
        };

        orders.push(newOrder);

        const updatedXml = builder.build({
            orders: { order: orders }
        });

        fs.writeFileSync(ordersFile, updatedXml, "utf8");

        res.status(201).json({
            message: "Your book order was saved successfully!",
            orderId: newOrder.orderId
        });
    } catch (error) {
        console.error(error);
        res.status(500).json({
            message: "Unable to save your order."
        });
    }
});

app.listen(PORT, () => {
    console.log(`Library server running at http://localhost:${PORT}`);
});
