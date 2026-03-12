Feedback Management System

Project Description

This project is a Spring Boot application where users can submit feedback and admin can manage the feedback.
Users can add feedback and view only their own feedback.
Admin can view and delete all feedback.

---

Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

Database Setup

1. Open MySQL.
2. Run the following commands:

CREATE DATABASE feedbackdb;

USE feedbackdb;

CREATE TABLE feedback(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(100),
message TEXT
);

---

Application Configuration

Open application.properties and configure database:

spring.datasource.url=jdbc:mysql://localhost:3306/feedbackdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

---

How to Run the Project

1. Open project in Eclipse or IntelliJ.
2. Run the main class:

ManagementAppApplication.java

3. The application will start on:

http://localhost:8080

---

API Endpoints

Add Feedback

POST
http://localhost:8080/user/add

Body:

{
"username":"Kashish",
"message":"Good App"
}

---

View User Feedback

GET
http://localhost:8080/user/my-feedback?username=Kashish

---

View All Feedback (Admin)

GET
http://localhost:8080/admin/all

---

Delete Feedback (Admin)

DELETE
http://localhost:8080/admin/delete/{id}

Example:

http://localhost:8080/admin/delete/1
