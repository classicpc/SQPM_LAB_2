# BinaryCalculatorWebapp - SQPM Lab 2

A comprehensive full-stack web application and REST API service for binary number calculations built with Apache Maven and Spring Boot framework.

## Overview

This project demonstrates the implementation of a production-ready web application featuring:
- **Model-View-Controller (MVC)** architecture for web interface
- **RESTful API** service for programmatic access
- **Binary arithmetic operations**: Addition, Multiplication, AND, OR
- **Comprehensive unit testing** with 22 test cases (100% pass rate)
- **Spring Boot deployment** on local Tomcat server (localhost:8080)

## Objectives

- ✓ Use Apache Maven to build and manage web application
- ✓ Learn Spring Boot framework for rapid web application development
- ✓ Implement REST API services with multiple response formats (plain text & JSON)
- ✓ Create MVC architecture using Thymeleaf templating engine
- ✓ Implement multiple binary arithmetic operators
- ✓ Develop comprehensive unit tests using JUnit 4 and Spring MockMvc
- ✓ Achieve complete test coverage with zero test failures

## Project Structure

```
SQPM_LAB_2/
├── src/
│   ├── main/
│   │   ├── java/com.ontariotechu.sofe3980U/
│   │   │   ├── Application.java
│   │   │   ├── Binary.java
│   │   │   ├── BinaryController.java
│   │   │   ├── BinaryAPIController.java
│   │   │   ├── BinaryAPIResult.java
│   │   │   ├── HelloController.java
│   │   │   ├── HelloAPIController.java
│   │   │   └── APIResult.java
│   │   └── resources/
│   │       └── templates/
│   │           ├── calculator.html
│   │           ├── result.html
│   │           ├── error.html
│   │           └── hello.html
│   └── test/
│       └── java/com.ontariotechu.sofe3980U/
│           ├── BinaryControllerTest.java (6 tests)
│           ├── BinaryAPIControllerTest.java (8 tests)
│           ├── HelloControllerTest.java (2 tests)
│           └── HelloAPIControllerTest.java (6 tests)
├── pom.xml
└── README.md
```

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Apache Maven** 3.6.0 or higher
- **Git** (optional, for version control)
- **Web Browser** for testing the application

## Installation & Setup

### 1. Clone or Download the Project
```bash
cd BinaryCalculatorWebapp/SQPM_LAB_2
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run Tests
```bash
mvn test
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## Features & Functionality

### Web Application (MVC)

**Home Page:** `http://localhost:8080/`
- Interactive calculator interface
- Form-based input for operands and operators
- Support for 4 binary operators: **+**, **\***, **&**, **|**

**Example Usage:**
1. Enter first binary number (e.g., `111`)
2. Select operator (`+`, `*`, `&`, or `|`)
3. Enter second binary number (e.g., `101`)
4. Click **=** to calculate
5. View result page with navigation options

### REST API Service

#### Addition
- **Plain Text:** `GET /add?operand1=111&operand2=1010` → `10001`
- **JSON:** `GET /add_json?operand1=111&operand2=1010`

#### Multiplication
- **Plain Text:** `GET /multiply?operand1=11&operand2=101` → `1111`
- **JSON:** `GET /multiply_json?operand1=11&operand2=101`

#### AND Operation
- **Plain Text:** `GET /and?operand1=111&operand2=101` → `101`
- **JSON:** `GET /and_json?operand1=111&operand2=101`

#### OR Operation
- **Plain Text:** `GET /or?operand1=101&operand2=011` → `111`
- **JSON:** `GET /or_json?operand1=101&operand2=011`

#### Greeting Services
- `GET /helloAPI` → "Hello World!"
- `GET /helloAPI?name=John` → "Hello John!"
- `GET /emailAPI` → JSON with email suggestion
- `GET /emailAPI?fname=Jack&lname=Sparrow` → Custom email suggestion

## Test Coverage

### Summary Statistics
| Metric | Value |
|---|---|
| **Total Test Cases** | 22 |
| **Test Classes** | 4 |
| **Failures** | 0 |
| **Errors** | 0 |
| **Skipped** | 0 |
| **Total Execution Time** | 11.210 seconds |
| **Success Rate** | 100% |

### Test Cases by Class

#### BinaryControllerTest.java (6 tests)
- `getDefault()` - Default calculator page load
- `getParameter()` - Query parameter handling
- `postParameter()` - Addition form submission (111 + 111 = 1110)
- `postParameterMultiply()` - Multiplication operation (11 × 101 = 1111)
- `postParameterAnd()` - AND operation (111 & 101 = 101)
- `postParameterOr()` - OR operation (101 | 011 = 111)

#### BinaryAPIControllerTest.java (8 tests)
- `add()` - Plain text addition endpoint
- `add2()` - JSON addition endpoint
- `multiply()` - Plain text multiplication endpoint
- `multiplyJSON()` - JSON multiplication endpoint
- `and()` - Plain text AND endpoint
- `andJSON()` - JSON AND endpoint
- `or()` - Plain text OR endpoint
- `orJSON()` - JSON OR endpoint

#### HelloAPIControllerTest.java (6 tests)
- `helloAPINoParameter()` - Default greeting
- `helloAPIWithName()` - Personalized greeting
- `EmailAPINoParameters()` - Default email suggestion
- `EmailAPIWithFirstName()` - Email with custom first name
- `EmailAPIWithLastName()` - Email with custom last name
- `EmailAPIWithFullName()` - Email with full custom name

#### HelloControllerTest.java (2 tests)
- `getDefault()` - Default greeting page
- `helloWithName()` - Greeting with custom name

## Running Maven Test Reports

View Maven test summary reports:
```bash
cd target/surefire-reports/
```

Test report locations:
- `com.ontariotechu.sofe3980U.BinaryAPIControllerTest.txt`
- `com.ontariotechu.sofe3980U.BinaryControllerTest.txt`
- `com.ontariotechu.sofe3980U.HelloAPIControllerTest.txt`
- `com.ontariotechu.sofe3980U.HelloControllerTest.txt`

Or view HTML reports:
```
target/site/index.html
```

## Technology Stack

| Technology | Version | Purpose |
|---|---|---|
| **Java** | 8+ | Programming language |
| **Spring Boot** | 2.1.2 | Web framework |
| **Apache Maven** | 3.6.0+ | Build automation |
| **JUnit** | 4.13.2 | Unit testing framework |
| **Spring Test** | 2.1.2 | Web layer testing |
| **Thymeleaf** | Latest | Template engine |
| **MockMvc** | Spring Test | Controller testing |

## Key Accomplishments

✅ **Full Operator Implementation:**
- Addition (+) with correct binary arithmetic
- Multiplication (*) with binary multiplication algorithm
- AND (&) with bitwise AND operation
- OR (|) with bitwise OR operation

✅ **Dual Interface:**
- Web interface with form submission and view templates
- REST API with both plain text and JSON responses

✅ **Production-Ready Code:**
- Comprehensive input validation in Binary class
- Proper error handling and edge case management
- Clean separation of concerns (MVC pattern)

✅ **Robust Testing:**
- 22 test cases with 100% pass rate
- Coverage of all operations and endpoints
- Both happy path and edge case validation

## JSON Response Format

Example JSON response for `/add_json?operand1=111&operand2=1010`:

```json
{
  "operand1": "111",
  "operand2": "1010",
  "operator": "add",
  "result": "10001"
}
```

## Building from Source

### Clean Build
```bash
mvn clean install
```

### Run with Maven
```bash
mvn spring-boot:run
```

### Package as WAR
```bash
mvn clean package
```

The packaged WAR file will be located in `target/BinaryCalculatorWebapp.war`

## Troubleshooting

### Maven Not Found
Ensure Maven is installed and available in PATH:
```bash
mvn -version
```

### Port 8080 Already in Use
Change the port in `application.properties`:
```properties
server.port=8081
```

### Test Failures
Run tests with verbose output:
```bash
mvn test -X
```

## Project Links

- **GitHub Repository:** [Add your GitHub project link]
- **Demo Video:** [Add your 5-minute demo video link]

## Authors & Contributors

- **Lab Course:** SOFE3980U - Software Quality & Process Management
- **Semester:** Winter 2026
- **Institution:** Ontario Tech University

## License

This project is provided as educational material for SOFE3980U Lab 2.

## Acknowledgments

- Spring Boot documentation for framework guidance
- Apache Maven for build automation
- JUnit and Spring Test for testing frameworks
- Thymeleaf for template engine support

## Contact & Support

For questions or issues with this project, please refer to the course materials or contact your instructor.

---

**Last Updated:** February 9, 2026  
**Status:** ✅ All Test Cases Passing (22/22)