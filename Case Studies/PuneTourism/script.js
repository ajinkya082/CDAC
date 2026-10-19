const form = document.getElementById("authForm");
const loginTab = document.getElementById("loginTab");
const registerTab = document.getElementById("registerTab");
const nameField = document.getElementById("nameField");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const passwordInput = document.getElementById("password");
const formTitle = document.getElementById("formTitle");
const formKicker = document.getElementById("formKicker");
const formDesc = document.getElementById("formDesc");
const submitBtn = document.getElementById("submitBtn");
const formMessage = document.getElementById("formMessage");

let mode = "login";

function setMode(nextMode) {
    mode = nextMode;
    const registering = mode === "register";
    loginTab.classList.toggle("active", !registering);
    registerTab.classList.toggle("active", registering);
    nameField.hidden = !registering;
    nameInput.required = registering;
    passwordInput.autocomplete = registering ? "new-password" : "current-password";
    formTitle.textContent = registering ? "Your journey starts here." : "Good to see you again.";
    formKicker.textContent = registering ? "JOIN THE JOURNEY" : "WELCOME BACK";
    formDesc.textContent = registering
        ? "Create an account to begin exploring Pune."
        : "Enter your details to continue exploring.";
    submitBtn.innerHTML = registering ? 'Create account <span>→</span>' : 'Log in <span>→</span>';
    formMessage.textContent = "";
    formMessage.className = "form-message";
}
loginTab.addEventListener("click", () => setMode("login"));
registerTab.addEventListener("click", () => setMode("register"));

function showMessage(message, type) {
    formMessage.textContent = message;
    formMessage.className = "form-message " + type;
}

form.addEventListener("submit", async event => {
    event.preventDefault();
    showMessage("", "");

    const email = emailInput.value.trim();
    const password = passwordInput.value;

    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        showMessage("Please enter a valid email address.", "error");
        emailInput.focus();
        return;
    }
    if (password.length < 8) {
        showMessage("Password must contain at least 8 characters.", "error");
        passwordInput.focus();
        return;
    }
    if (mode === "register" && !/^[\p{L}][\p{L} .'-]{1,59}$/u.test(nameInput.value.trim())) {
        showMessage("Please enter a valid full name.", "error");
        nameInput.focus();
        return;
    }

    submitBtn.disabled = true;
    submitBtn.textContent = mode === "register" ? "Creating account..." : "Logging in...";

    try {
        const endpoint = mode === "register" ? "/api/register" : "/api/login";
        const payload = mode === "register"
            ? { name: nameInput.value.trim(), email, password }
            : { email, password };

        const response = await fetch(endpoint, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(payload)
        });
        const data = await response.json();
        if (!response.ok || !data.success) {
            showMessage(data.message || "Something went wrong. Please try again.", "error");
        } else {
            showMessage(data.message, "success");
            if (mode === "register") {
                form.reset();
                setMode("login");
                showMessage(data.message, "success");
            }
        }
    } catch {
        showMessage("Cannot reach the server. Start it with: npm start", "error");
    } finally {
        submitBtn.disabled = false;
        submitBtn.innerHTML = mode === "register"
            ? 'Create account <span>→</span>'
            : 'Log in <span>→</span>';
    }
});
