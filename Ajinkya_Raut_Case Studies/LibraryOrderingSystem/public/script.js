
const form = document.getElementById("orderForm");
const nameInput = document.getElementById("customerName");
const addressInput = document.getElementById("address");
const phoneInput = document.getElementById("phone");
const categorySelect = document.getElementById("category");
const bookSelect = document.getElementById("book");
const message = document.getElementById("message");

let books = [];

// Load books from the server
async function loadBooks() {
    try {
        const response = await fetch("/api/books");

        if (!response.ok) {
            throw new Error("Unable to load books.");
        }

        books = await response.json();

        const categories = [
            ...new Set(books.map(book => book.category))
        ];

        categories.forEach(category => {
            const option = document.createElement("option");
            option.value = category;
            option.textContent = category;
            categorySelect.appendChild(option);
        });

        displayBooks();
    } catch (error) {
        alert("Error loading books from the server.");
    }
}

// Display books according to the selected category
function displayBooks() {
    const selectedCategory = categorySelect.value;

    bookSelect.replaceChildren();

    const defaultOption = document.createElement("option");
    defaultOption.value = "";
    defaultOption.textContent = "Select a book";
    bookSelect.appendChild(defaultOption);

    const filteredBooks = books.filter(book =>
        selectedCategory === "All" ||
        book.category === selectedCategory
    );

    filteredBooks.forEach(book => {
        const option = document.createElement("option");
        option.value = book.id;
        option.textContent =
            `${book.name} - ${book.author}`;

        bookSelect.appendChild(option);
    });
}

categorySelect.addEventListener("change", displayBooks);

// Validate and submit the order
form.addEventListener("submit", async function (event) {
    event.preventDefault();

    const customerName = nameInput.value.trim();
    const address = addressInput.value.trim();
    const phone = phoneInput.value.trim();
    const bookId = bookSelect.value;

    // Name validation
    if (!/^[\p{L}][\p{L}\s.'-]*$/u.test(customerName)) {
        alert("Name must contain letters, not numbers.");
        nameInput.focus();
        return;
    }

    // Address validation
    if (address.length < 5) {
        alert("Please enter a complete contact address.");
        addressInput.focus();
        return;
    }

    // Phone validation
    if (!/^[6-9]\d{9}$/.test(phone)) {
        alert("Enter a valid 10-digit Indian mobile number.");
        phoneInput.focus();
        return;
    }

    // Book selection validation
    if (!bookId) {
        alert("Please select a book.");
        bookSelect.focus();
        return;
    }

    try {
        const response = await fetch("/api/orders", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                customerName,
                address,
                phone,
                bookId
            })
        });

        const result = await response.json();

        if (!response.ok) {
            throw new Error(result.message || "Order failed.");
        }

        alert(result.message);

        message.textContent =
            `${result.message} Order ID: ${result.orderId}`;

        message.style.color = "green";
        form.reset();
        displayBooks();
    } catch (error) {
        message.textContent = error.message;
        message.style.color = "red";
        alert(error.message);
    }
});

// Start the application
loadBooks();
