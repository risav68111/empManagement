---

# 🧑‍💼 Employee Management REST API

This is a **simple RESTful API** that performs basic **CRUD (Create, Read, Update, Delete)** operations on employee data. It is built using:

* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**

## 📦 Features

* Add new employee
* View all employees
* View a specific employee by ID
* Update existing employee data
* Delete an employee

## 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## 🚀 Running Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-crud-api.git
   cd employee-crud-api
   ```

2. Configure your `application.properties` (MySQL credentials):

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

## 📫 API Endpoints

> For local access, append the endpoints to your local IP (e.g., `http://localhost:8080`)

| Method | Endpoint                  | Description                          |
| ------ | ------------------------- | ------------------------------------ |
| GET    | `/api/v1/emp/`            | Fetch all employees                  |
| GET    | `/api/v1/emp/{id}`        | Get an employee by ID                |
| POST   | `/api/v1/emp/new`         | Add a new employee (JSON in request) |
| PUT    | `/api/v1/emp/update/{id}` | Update employee data by ID           |
| DELETE | `/api/v1/emp/delete/{id}` | Delete an employee by ID             |

## 📄 Sample JSON Payload for POST/PUT

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

## 📘 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---


