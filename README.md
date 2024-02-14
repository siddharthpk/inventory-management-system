# Inventory Management System

This Inventory Management System is a full-stack web application designed to streamline the process of managing an inventory, providing users with the ability to track, update, and maintain inventory records efficiently. Built with a Spring Boot backend and a React frontend, the application offers a robust solution for small to medium-sized businesses looking for a simple yet powerful tool to handle their inventory needs.

## Features

- **CRUD Operations**: Users can create, read, update, and delete inventory items through a user-friendly web interface.
- **RESTful API**: The backend is built using Spring Boot, exposing a RESTful API that allows for easy integration with the frontend or any other client.
- **Database Integration**: Utilizes PostgreSQL for reliable data storage, ensuring data persistence and security.
- **Responsive Design**: The frontend is developed with React, offering a responsive design that works seamlessly across desktop and mobile devices.
- **Error Handling**: Comprehensive error handling mechanisms are implemented to provide users with clear feedback on any issues.

## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, Hibernate, PostgreSQL
- **Frontend**: React.js, Axios, Bootstrap (for styling)
- **Build Tools & Deployment**: Maven, Netlify (Frontend), Heroku (Backend)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. The project consists of two main parts: the backend (built with Spring Boot) and the frontend (built with React).

### Prerequisites

Before you begin, ensure you have the following installed on your system:
- Java JDK 11 or higher
- Maven (for building the backend)
- Node.js and npm (for running the frontend)
- PostgreSQL (for the database)

### Backend Setup

1. **Clone the repository** to your local machine.

2. **Set up the PostgreSQL database**:
   - Create a new database named `inventory_management`.
   - Adjust the `src/main/resources/application.properties` file in the backend project to include your database connection details:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/inventory_management
     spring.datasource.username=<your_username>
     spring.datasource.password=<your_password>
     ```

3. **Run the backend application**:
   - Navigate to the root directory of the backend project.
   - Use Maven to start the application:
     ```bash
     mvn spring-boot:run
     ```
   - The backend should now be running on `http://localhost:8080`.

### Frontend Setup

1. **Navigate to the frontend directory** within the cloned repository.

2. **Install dependencies**:
   ```bash
   npm install


## Contribution

Contributions to the Inventory Management System project are welcome! Whether you're interested in fixing bugs, adding new features, or improving documentation, please feel free to make a pull request.

