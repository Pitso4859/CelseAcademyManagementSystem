# **Celeste Academy Management System** 🏫📚  

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.0-green.svg)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue.svg)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1.1-orange.svg)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-purple.svg)

A **complete student management system** built with Spring Boot, Thymeleaf, and MySQL for efficient learner record management.

## **Features** ✨
- **Full CRUD Operations** (Create, Read, Update, Delete learners)
- **Responsive UI** with Bootstrap 5
- **Database Integration** with Spring Data JPA
- **Form Validation** for data integrity
- **RESTful Routing** for clean URLs

## **Tech Stack** 💻
| Category       | Technologies                          |
|----------------|---------------------------------------|
| **Backend**    | Spring Boot 3, Spring MVC, Spring Data JPA, Hibernate |
| **Frontend**   | Thymeleaf, Bootstrap 5, HTML5, CSS3   |
| **Database**   | MySQL 8+                              |
| **Build Tool** | Maven                                 |

## **Prerequisites** 📋
- Java 17+
- MySQL 8.0+
- Maven 3.6+

## **Installation** 🛠️
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/celeste-academy-management.git
   cd celeste-academy-management
   ```

2. **Configure Database**
   - Create a MySQL database named `celeste_academy`
   - Update `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/celeste_academy
     spring.datasource.username=yourusername
     spring.datasource.password=yourpassword
     ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**
   Open in browser: [http://localhost:8080/learners](http://localhost:8080/learners)

## **Project Structure** 📂
```
celeste-academy-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── pitsocode/
│   │   │           └── celseacademymanagementsystem/
│   │   │               ├── controller/   # Spring controllers
│   │   │               ├── entity/       # JPA entities
│   │   │               ├── repository/   # JPA repositories
│   │   │               ├── service/      # Business logic
│   │   │               └── CelesteAcademyManagementSystemApplication.java
│   │   └── resources/
│   │       ├── static/  # CSS, JS, images
│   │       ├── templates/ # Thymeleaf files
│   │       └── application.properties
├── pom.xml
└── README.md
```

## **Screenshots** 📸
| Feature        | Screenshot                          |
|----------------|-------------------------------------|
| **Learner List** | <img width="1920" height="1080" alt="Screenshot (6)" src="https://github.com/user-attachments/assets/5374c470-e6ae-40c4-8bd3-7f8d720735ee" />
|
| **Add Learner**  | <img width="1920" height="1080" alt="Screenshot (7)" src="https://github.com/user-attachments/assets/c460f967-55de-4a9c-98dd-90bdf0e0e57c" />

| **Edit Learner** | <img width="1920" height="1080" alt="Screenshot (8)" src="https://github.com/user-attachments/assets/2f9a03b2-f437-4c9c-8800-b8ccd3d791a8" />


## **Contributing** 🤝
Contributions are welcome! Please follow these steps:
1. Fork the project
2. Create your feature branch 
3. Commit your changes 
4. Push to the branch 
5. Open a Pull Request

## **License** 📜
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## **Contact** 📧
For questions or support, contact:  
📩 pnkotolane@gmail.com  

**Happy Coding!** 🚀  
*"Education is the most powerful weapon which you can use to change the world." - Nelson Mandela*
