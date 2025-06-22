# 🌍 My Travel Journal — Backend

This is the **Spring Boot backend** for the full-stack travel journal application.  
It provides a REST API to manage travel entries — including location, country, travel dates, descriptions, and image URLs.  
The backend supports full CRUD operations and connects to a **local PostgreSQL database**.

## 🔗 Related Repositories

- 🔧 [my-travel-journal (Frontend Repo)](https://github.com/rauschen84/my-travel-journal)

---

## 🔗 Live Demo

👉 [Try the standalone version here](https://my-travel-journal-standalone.vercel.app/)

📝 *Note: This is a **frontend-only demo** using localStorage, with the same features but no backend connection.*

---

## ✨ Features

- ✅ REST API with full CRUD support
- 🧾 Travel entries include: location, country, arrival/departure dates, description, and image URLs
- 💡 Simple architecture using Spring Boot, JPA, and Spring Web
- 🧪 Sample data automatically loaded via `DataInitializer`
- 🔌 CORS enabled for local frontend dev (`http://localhost:5173`)

---

## 📁 Folder Structure
```
travel-journal-backend/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── structure.txt
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/alex/traveljournal/backend/
│ │ │ ├── BackendApplication.java
│ │ │ ├── DataInitializer.java
│ │ │ ├── Entry.java
│ │ │ ├── EntryController.java
│ │ │ └── EntryRepository.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/com/alex/traveljournal/backend/
│ └── BackendApplicationTests.java
└── target/ (build output)
```
---

## 🚀 Getting Started 

### 🔧 Prerequisites

- Java 17+
- Maven
- PostgreSQL

### 🛠️ Installation & Running Locally

### 1. Clone the repo:

```bash

git clone https://github.com/rauschen84/my-travel-journal-backend.git
cd my-travel-journal-backend
```

### 2. Create a PostgreSQL database:

```bash

CREATE DATABASE traveljournal;
```

### 3. Update the config in src/main/resources/application.properties:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/traveljournal
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Start the backend server:

```bash

./mvnw spring-boot:run
```

The app will be available at:
👉 http://localhost:8080

---

## 🛠️ Built With

- Java 17

- Spring Boot 3

- Spring Data JPA

- PostgreSQL

- Maven

---

## 📦 REST API Endpoints

| Method | Endpoint           | Description               |
|--------|--------------------|---------------------------|
| GET    | /api/entries       | Get all travel entries    |
| POST   | /api/entries       | Create a new travel entry |
| PUT    | /api/entries/{id}  | Update an existing entry  |
| DELETE | /api/entries/{id}  | Delete an entry           |


## 💡 Future Enhancements

- 🕰️ Backend weather integration to show past weather data based on travel dates

- 🖼️ Image upload to cloud storage (e.g., Cloudinary)

- ☁️ Cloud deployment (Render or Railway)

---

## 👤 Author

Alexander Schultheiss / rauschen84
GitHub: @rauschen84

---

## 📄 License

This project is open source and free to use for educational and personal portfolio purposes.