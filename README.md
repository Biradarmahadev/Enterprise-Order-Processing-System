<div align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=36&pause=1000&color=6A5ACD&center=true&vCenter=true&width=700&lines=Enterprise+Order+Processing+System;Spring+Boot+%2B+MySQL+Backend;Production-Ready+Layered+Architecture" alt="Typing SVG Banner">
  <br><br>

  <img src="https://socialify.git.ci/Biradarmahadev/Enterprise-Order-Processing-System/image?custom_description=A+production-ready+backend+system+built+using+Spring+Boot+that+handles+order+creation%2C+processing%2C+and+persistence+in+a+scalable+and+structured+way.&custom_language=Spring+Boot&description=1&font=Rokkitt&forks=1&issues=1&language=1&logo=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2Fthumb%2F3%2F30%2FJava_programming_language_logo.svg%2F960px-Java_programming_language_logo.svg.png&name=1&owner=1&pulls=1&stargazers=1&theme=Light" alt="project-image" width="780" style="border-radius:12px; box-shadow:0 8px 25px rgba(0,0,0,0.15);">

  <br><br>

  <img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/MySQL-8.0-orange?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
  <img src="https://img.shields.io/badge/Maven-Build-success?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
  <img src="https://img.shields.io/badge/Swagger-OpenAPI-green?style=for-the-badge&logo=swagger&logoColor=white" alt="Swagger">
</div>

<br>

# Enterprise Order Processing System

**Production-ready Spring Boot backend for managing orders in an enterprise environment**

Clean layered architecture (Controller → Service → Repository)  
RESTful APIs for order creation, retrieval & management  
MySQL persistence with Spring Data JPA  
Exception handling, validation & Swagger documentation

Ideal for:  
→ Backend developer portfolio  
→ Learning enterprise Spring Boot patterns  
→ Demonstrating real-world order workflow

## ✨ Key Features

- Create, fetch & retrieve orders by ID via REST APIs  
- Layered architecture: Controller, Service, Repository  
- Spring Data JPA + Hibernate for database operations  
- MySQL integration (also works with H2 for dev)  
- Global exception handling & input validation  
- OpenAPI 3 / Swagger UI documentation  
- Maven-based build & easy Docker support

## 🏗 Modern Architecture Overview

```mermaid
graph LR
    %% Modern styling
    classDef client fill:#1e3a8a,stroke:#60a5fa,stroke-width:2px,color:#dbeafe,rx:10px
    classDef gateway fill:#1e293b,stroke:#f472b6,stroke-width:2px,color:#fce7f3,rx:10px
    classDef controller fill:#1e293b,stroke:#34d399,stroke-width:2px,color:#d1fae5,rx:10px
    classDef service fill:#1e293b,stroke:#fbbf24,stroke-width:2px,color:#fefce8,rx:10px
    classDef repo fill:#1e293b,stroke:#a78bfa,stroke-width:2px,color:#f3e8ff,rx:10px
    classDef db fill:#1e293b,stroke:#f87171,stroke-width:2px,color:#fee2e2,rx:10px

    %% Flow
    A[Client<br>Postman / Frontend / Mobile]:::client -->|HTTPS / REST| B[Spring Boot Application<br>Port 8080]:::gateway

    subgraph "Layered Architecture"
        B --> C[Controller Layer<br>@RestController<br>OrderController]:::controller
        C --> D[Service Layer<br>@Service<br>OrderService]:::service
        D --> E[Repository Layer<br>@Repository<br>OrderRepository<br>Spring Data JPA]:::repo
        E --> F[(MySQL Database<br>order_db<br>Orders Table)]:::db
    end

    %% Additional flows
    D -->|Validation + Business Logic| G[Exception Handling<br>@ControllerAdvice<br>GlobalExceptionHandler]:::controller
    C -->|OpenAPI / Swagger| H[Swagger UI<br>/swagger-ui.html]:::gateway

    %% Legend
    classDef legend fill:#111827,stroke:#4b5563,stroke-width:1px,color:#9ca3af
    Legend[→ REST / HTTPS<br>→ Internal Call<br>→ Database Access]:::legend

    style Legend text-align:left
```
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
