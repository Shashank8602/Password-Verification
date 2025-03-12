# Password-Verification

🔐 Password Verification API
This Spring Boot project provides a simple API for securely encoding and verifying passwords. It helps ensure secure password handling using encryption techniques, making it suitable for authentication and security-related applications.

🚀 Features
Encode Password: Converts a plain text password into a secure hashed format.
Verify Password: Checks if a given password matches its encoded version.
Uses BCrypt hashing for secure one-way password encryption.

🛠 API Endpoints
🔹 Encode Password
Endpoint: POST /encode

Request Body:
{
  "rawPassword": "yourPassword"
}
Response:
{
  "message": "Encoded Password: $2a$10$...."
}

🔹 Verify Password
Endpoint: POST /verify

Request Body:
{
  "rawPassword": "yourPassword",
  "encodedPassword": "$2a$10$...."
}

Response (Success):
{
  "message": "Passwords matches"
}

Response (Failure):
{
  "message": "Passwords did not match"
}


🏗 Tech Stack
Spring Boot
Spring Security (BCrypt)
Postman (for API testing)
