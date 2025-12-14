# JDBC Manager Management System

This is a console-based mini project built using **Advance Java (JDBC)** and **PostgreSQL**.  
The project demonstrates how Java applications interact with a database using JDBC.

---

## 🔹 Project Overview

The **Manager Management System** allows performing CRUD operations on Manager records stored in a PostgreSQL database.

---

## 🔹 Features

- Insert Manager details into database
- Fetch Manager by ID
- Update Manager name
- Delete Manager record
- Menu-driven console application
- Uses DAO design pattern
- Secure SQL execution using PreparedStatement

---

## 🔹 Project Structure

ManagerOperation
│
├── Manager.java (Model / POJO class)
├── ManagerDAO.java (DAO – Database logic)
└── ManagerController.java (Controller – Main class)

---

## 🔹 Technologies Used

- Java (Advance Java – JDBC)
- PostgreSQL
- Eclipse IDE
- JDBC Driver (org.postgresql.Driver)

---

## 🔹 Database Details

**Database Name:** company  
**Table Name:** manager  

```sql
CREATE TABLE manager (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    sal INT
);

🔹 JDBC Concepts Covered
Driver loading
Database connection
PreparedStatement
ResultSet
CRUD operations
Exception handling
DAO pattern

🔹 How to Run the Project
Clone the repository
Open project in Eclipse
Add PostgreSQL JDBC driver to build path
Create database & table in PostgreSQL
Update DB credentials in ManagerDAO
Run ManagerController.java

🔹 Output
Console-based menu
Successful insert, update, delete, and fetch operations
Real-time database updates


🔹 Learning Outcome
This project strengthened my understanding of backend Java development and database interaction using JDBC.
