<h1 align="center" id="title">Enterprise Order Processing System</h1>

<p align="center"><img src="https://socialify.git.ci/Biradarmahadev/Enterprise-Order-Processing-System/image?custom_description=A+production-ready+backend+system+built+using+Spring+Boot+that+handles+order+creation%2C+processing%2C+and+persistence+in+a+scalable+and+structured+way.+&amp;custom_language=Spring+Boot&amp;description=1&amp;font=Rokkitt&amp;forks=1&amp;issues=1&amp;language=1&amp;logo=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2Fthumb%2F3%2F30%2FJava_programming_language_logo.svg%2F960px-Java_programming_language_logo.svg.png&amp;name=1&amp;owner=1&amp;pulls=1&amp;stargazers=1&amp;theme=Light" alt="project-image"></p>

<p id="description">The Enterprise Order Processing System is a backend application developed using Spring Boot to manage and process orders in an enterprise environment. The system provides RESTful APIs to create retrieve and manage order data efficiently. The application follows a layered architecture consisting of Controller Service and Repository layers ensuring clean code structure and easy maintainability. Order information is stored in a MySQL database and Spring Data JPA is used for database interactions. This project demonstrates how real-world backend systems handle order workflows data persistence and API communication in a scalable and structured manner. It is designed to reflect industry-level backend development practices.</p>

<p align="center"><img src="https://img.shields.io/badge/Java-17-blue" alt="shields"><img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen" alt="shields"><img src="https://img.shields.io/badge/MySQL-8.0-orange" alt="shields"><img src="https://img.shields.io/badge/Maven-Build-success" alt="shields"></p>

<h2>🚀 Demo</h2>

### 🔁 Application Flow (GIF)

![Order Processing System Demo](screenshots/demovideo-ezgif.com-video-to-gif-converter.gif)

---

### 🎬 Full Demo Video

[▶️ Watch Demo Video](https://github.com/Biradarmahadev/Enterprise-Order-Processing-System/blob/main/screenshots/demovideo.mp4)

---

### 🔗 Local API Endpoint (Development)

http://localhost:8080/orders



## Project Screenshots

### Create Order (HIBERNET H2)
![Create Order](screenshots/h2-orders-table.png)

### Fetch Orders (GET API and POST API)
![Fetch Orders](screenshots/postman-create-order.png)

### Orders Stored in MySQL
![MySQL Table](screenshots/mysql.png)

  
  
<h2>🧐 Features</h2>

Here're some of the project's best features:

*   Create new orders using REST APIs
*   Fetch all orders from the database
*   Fetch order by ID
*   MySQL database integration
*   Clean layered architecture (Controller Service Repository)
*   Uses Spring Data JPA for database operations
*   Exception handling and validation

<h2>🛠️ Installation Steps:</h2>

<p>1. Clone the repository</p>

```
git clone https://github.com/Biradarmahadev/Enterprise-Order-Processing-System.git
```

<p>2. Navigate to project directory</p>

```
cd Enterprise-Order-Processing-System
```

<p>3. Configure MySQL database in application.properties</p>

```
spring.datasource.url=jdbc:mysql://localhost:3306/order_db spring.datasource.username=root spring.datasource.password=your_password
```

<p>4. Run the application</p>

```
mvn spring-boot:run
```

<h2>🍰 Contribution Guidelines:</h2>

Contributions are welcome. Please fork the repository create a new branch and submit a pull request with clear commit messages.

  
  
<h2>💻 Built with</h2>

Technologies used in the project:

*   Java
*   Spring Boot
*   Spring Data JPA
*   MySQL
*   Maven
*   REST APIs
*   Hibernate

<h2>🛡️ License:</h2>

This project is licensed under the MIT License

<h2>💖Like my work?</h2>

If you have any questions or suggestions feel free to open an issue or contact me via GitHub.
