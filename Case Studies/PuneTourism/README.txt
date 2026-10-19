PUNE TOURISM FRONT PAGE — XML REGISTRATION / LOGIN

Requirements:
- Node.js installed
- No npm packages required (uses Node built-in modules)

Run:
1. Extract the ZIP.
2. Open the PuneTourism folder in VS Code.
3. Open Terminal > New Terminal.
4. Run: npm start
5. Open: http://localhost:3000
6. Register using a name, email, and password (minimum 8 characters).
7. Log out is not needed for this demo; switch to Log in and test the same credentials.
8. Registered users are saved to data/users.xml on the server.

Files:
- index.html: Tourism landing page and login/register UI
- style.css: responsive styling and moving hero image
- script.js: client-side validation and API requests
- server.js: Node.js server, XML read/write, registration and login checks
- data/users.xml: server-side XML user data

IMPORTANT:
This is an educational local demo. Passwords are hashed with Node's scrypt before being stored in XML.
For a real public website, use HTTPS, secure session management, rate limiting, CSRF protection,
a maintained XML parser, and a production-grade database/authentication service.
The hero/destination images load from Unsplash and need an internet connection.
