# Spring Boot Form Validator

A Spring Boot web application that demonstrates **server-side form validation** using Thymeleaf and Hibernate Validator. Users fill in a login-style form, the server validates the input, and clear error messages are shown next to each invalid field.



## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Validation Rules](#validation-rules)
- [Application Flow](#application-flow)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Future Improvements](#future-improvements)
- [Author](#author)

 Overview
Client-side checks in the browser can be bypassed, so important validation must also happen on the server. This project shows how to do that with Spring MVC and the Jakarta Bean Validation API. Invalid submissions are sent back to the form with field-level error messages, and valid submissions move on to a success page that displays the submitted details.

#Features
- Server-side validation of every form submission
- Required and length checks on the user name
- Email format validation
- Terms and conditions acceptance check
- Field-level error messages displayed inline with Bootstrap styling
- Form values preserved after a failed submission
- Success page showing the validated name and email
- Maven Wrapper included, so no separate Maven install is needed

#Tech Stack

| Layer           | Technology                              |
| --------------- | --------------------------------------- |
| Language        | Java 21                                 |
| Framework       | Spring Boot 4.1.0 (Spring Web MVC)     |
| Template Engine | Thymeleaf                               |
| Validation      | Spring Validation, Hibernate Validator  |
| Front-end       | Bootstrap 4.4.1 (loaded from CDN)       |
| Build Tool      | Apache Maven (Maven Wrapper)            |
| Dev Tools       | Spring Boot DevTools                    |

# Project Structure
Spring-Boot-form-Validator/<br>
├── .mvn/wrapper/                        
├── src/<br>
│   ├── main/<br>
│   │   ├── java/com/validate/<br>
│   │   │   ├── SpringValidatorApplication 
│   │   │   ├── controller/<br>
│   │   │   │   └── MyController <br>          
│   │   │   └── entities/<br>
│   │   │       └── LoginData  <br>           
│   │   └── resources/<br>
│   │       ├── templates/<br>
│   │       │   ├── form.html              
│   │       │   └── success.html <br>          
│   │       └── application.properties  <br>  
│   └── test/java/com/validate/  <br>          
├── mvnw / mvnw.cmd    <br>                    
└── pom.xml   <br>                             
```

# Validation Rules
| Field                 | Rule                                                     | Error Message                            |
| --------------------- | -------------------------------------------------------- | ---------------------------------------- |
| Name                  | Must not be blank                                        | User name can't be empty                 |
| Name                  | Length between 3 and 13 characters                       | User name must be between 3 - 12 characters |
| Email                 | Must match the pattern `local-part@domain`               | Invalid email                            |
| Terms and Conditions  | Checkbox must be ticked                                  | Agreed terms and conditions              |

## Application Flow
1. The user opens the form page.
2. The user enters a name and email, and ticks the terms checkbox.
3. On submit, the server validates the input against the rules above.
4. **If validation fails:** the form is shown again with the entered values and an error message under each invalid field.
5. **If validation passes:** the success page is shown with the submitted name and email.

## Getting Started

### Prerequisites
- JDK 21 or later
- Git
- An IDE such as Eclipse, Spring Tools Suite, or IntelliJ IDEA (optional)

# Installation and Run
1. Clone the repository:

   ```bash
   git clone https://github.com/mushtaque-ahmed512/Spring-Boot-form-Validator.git
   cd Spring-Boot-form-Validator
   ```
2. Start the application:
   - Windows: `mvnw.cmd spring-boot:run`

3. Open your browser and go to:
   ```
   http://localhost:8080/form
   ```

### Build a Runnable JAR
```bash
./mvnw clean package
java -jar target/springValidator-0.0.1-SNAPSHOT.jar
```

## Endpoints

| Method | URL        | Description                                              |
| ------ | ---------- | -------------------------------------------------------- |
| GET    | `/form`    | Displays the empty login form                            |
| POST   | `/process` | Validates the form; shows the form again on errors, or the success page when valid |

## Future Improvements
- Add a stricter email rule that requires a valid domain extension
- Move validation messages into a message properties file for easier maintenance
- Add unit and integration tests for the validation rules and controller
- Add more form fields such as password and phone number
- Replace console logging with a proper logging framework
- Persist valid submissions to a database

## Author
**Mushtaque Ahmed**
GitHub: [@mushtaque-ahmed512](https://github.com/mushtaque-ahmed512)
