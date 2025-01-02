# RESTful-web-service-using-Spring-Boot

## Overview
This project is a RESTful web service built using Java Spring Boot to manage a list of employees. The service provides an endpoint to retrieve a JSON representation of all employees.

## Features
- **Endpoint**: 
  - `GET /employees`  
    Returns a JSON response with the list of employees in the following format:
    ```json
    {
        "Employees": [
            {
                "employee_id": "string",
                "first_name": "string",
                "last_name": "string",
                "email": "string",
                "title": "string"
            }
        ]
    }
    ```

- **Components**:
  - `Employee` Class: Represents an employee with fields for `employee_id`, `first_name`, `last_name`, `email`, and `title`.
  - `Employees` Class: Manages a hardcoded list of employee objects.
  - Controller: Handles HTTP GET requests and returns the list of employees.

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven

### Setup and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/AishwaryaRajur22/RESTful-web-service-using-Spring-Boot.git
   cd RESTful-web-service-using-Spring-Boot

2. Build the project:
   ```bash
   mvn clean install

3. Run the application:
   ```bash
   mvn spring-boot:run

4. Access the endpoint:
   ```bash
   http://localhost:8080/employees
