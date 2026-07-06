# Wells Fargo Task 2 – Spring Boot JPA Entity Model

## 📌 Overview
This project is part of the Wells Fargo Software Engineering Forage program.  
It demonstrates a Spring Boot application using JPA entity relationships for a financial advisory system.

## 🧩 Entities
- Advisor
- Client
- Portfolio
- Security

## 🔗 Relationships
- Advisor → Clients (One-to-Many)
- Client → Advisor (Many-to-One)
- Client → Portfolio (One-to-One)
- Portfolio → Securities (One-to-Many)
- Security → Portfolio (Many-to-One)

## ⚙️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## 🏃 How to Run
```bash
./mvnw.cmd clean compile