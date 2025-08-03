# Desafio_DWF1

This project consists of a REST API built with Spring Boot that facilitates the management of a book collection, providing functions such as listing, adding, searching by title, and deleting books through specific endpoints. The business logic is structured in layers using a "Book" entity, a JPA repository, a service, and a REST controller to perform operations.

how to execute the project:

Prerequisites:
Java 17+ installed

Maven installed 

 Run via Terminal:
Navigate to your project folder using cd

Build the project (optional, to check for errors):

mvn clean install

Run the application:

mvn spring-boot:run

 Run via IDE:
Open the project in your IDE.

Locate the class BookstoreApplication.java.

Right-click and select Run

Using Postman or Swagger for endpoint testing

URL to test endpoints

http://localhost:8080/api/books

URL to see the database
http://localhost:8080/h2-console/login.do?jsessionid=a01a738eca0d1333460628247a736f39

POSTMAN TEST:
https://web.postman.co/workspace/My-Workspace~a278a63c-061e-4a61-8271-b6d6c01d6a6a/collection/46368481-01ef6662-c342-4a3e-a912-b67c22b042f2?action=share&source=copy-link&creator=46368481
