# Spring Boot Web Application

This is a simple Spring Boot web application demonstrating basic Spring MVC features such as handling HTTP requests, rendering views with JSP, and using `ModelAndView` and `@ModelAttribute` to manage data flow between controllers and views.

## Features

- **Spring Boot Setup**: Basic Spring Boot configuration with MVC support.
- **Controller Layer**:
  - `HomeController` handles requests for the root URL (`/`) and addition functionality (`/add`).
  - Uses `ModelAndView` to return both model data and views from controllers.
  - **`@ModelAttribute`**: Automatically binds request parameters to model objects (e.g., `Calculator`).
  - Separated model and controller packages to maintain clean architecture.

- **View Configuration**:
  - JSP views are located in the `/views/` directory and use the `.jsp` extension.
  - View resolution is configured in `application.properties`:
    ```properties
    spring.mvc.view.prefix = /views/
    spring.mvc.view.suffix = .jsp
    ```

- **Static Resources**:
  - CSS and other static resources (JavaScript, images) are placed in the `/static/` directory.

- **Flow**:
  1. The user accesses the homepage (`/`).
  2. The `HomeController` processes the addition of two numbers via the `/add` endpoint (e.g., `/add?num1=5&num2=10`).
  3. The result is calculated and passed to the view using `ModelAndView`.
  4. The result is displayed in the `result.jsp` view.

## Requirements

- JDK 11 or later
- Maven (for dependency management)
- Spring Boot 2.x
