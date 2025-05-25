# Employee Management System 🧑‍💼🌐

A simple Spring Boot application for managing employees with RESTful APIs. This system supports adding, updating, searching, and deleting employee records in memory.

## 🚀 Features

- Add new employees
- Update existing employee details
- Search employees by ID
- Delete employee records
- Follows RESTful API design

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Lombok (optional)
- Maven

## 📁 Project Structure

src
└── main
├── java
│ └── com.example.employeemanagement
│ ├── controller
│ ├── model
│ ├── service
│ └── EmployeeManagementApplication.java
└── resources
└── application.properties


## 📫 API Endpoints

| Method | Endpoint              | Description              |
|--------|-----------------------|--------------------------|
| POST   | `/addEmployee`        | Add a new employee       |
| PUT    | `/update`             | Update an employee       |
| PUT    | `/search`             | Search employee by ID    |
| DELETE | `/delete/{id}`        | Delete employee by ID    |

## 🧪 Sample Request

**POST /addEmployee**
```json
{
  "employee_Id": 101,
  "name": "John Doe",
  "department": "IT"
}


## Contact

For any queries or feedback, please reach out:

- **Developer:** Dharneesh S
- **Email:** ddharnish42@gmail.com
- **LinkedIn:** https://www.linkedin.com/in/dharneesh-s-563a9b2a3/

-      This project was developed to enhance backend coding skills for learning purposes. Feel free to contribute or share any suggestions!
