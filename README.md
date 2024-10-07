
# Project Name

This is a Java-based project that provides a course management system with user authentication, role-based access, and a user-friendly graphical interface built using Java Swing. It features authentication, user role management, course management, and various utilities for database interaction and data validation.

## Project Structure

```
.
├── .classpath
├── .gitignore
├── .project
├── README.md
├── .vscode/
│   └── settings.json
├── External_JARS/
│   └── mysql-connector-j-8.0.32.jar
└── src/
    ├── App.java
    ├── auth/
    │   └── Auth.java
    ├── exceptions/
    │   ├── InvalidEmailException.java
    │   └── InvalidPasswordException.java
    ├── models/
    │   ├── course/
    │   │   ├── Course.java
    │   │   └── Module.java
    │   └── user/
    │       ├── Admin.java
    │       ├── Student.java
    │       ├── SystemUser.java
    │       └── Teacher.java
    ├── pages/
    │   ├── Courses.java
    │   ├── Dashboard.java
    │   ├── Login.java
    │   ├── SignUp.java
    │   ├── SplashScreen.java
    │   ├── Students.java
    │   └── Teachers.java
    ├── resources/
    │   ├── add.png
    │   ├── assign.png
    │   ├── courses.png
    │   ├── edit.png
    │   ├── login_image.png
    │   ├── logo.png
    │   ├── logo_round.png
    │   ├── password_eye_hide.png
    │   ├── password_eye_show.png
    │   ├── remove.png
    │   ├── search_icon.png
    │   ├── settings.png
    │   ├── signup_image.png
    │   ├── student.png
    │   └── teacher.png
    └── util/
        ├── CellRenderer.java
        ├── CustomImage.java
        ├── DatabaseManager.java
        ├── DataManager.java
        ├── DataRetriever.java
        └── Validator.java
```

## Prerequisites

- Java 8 or above
- MySQL database
- [MySQL Connector JAR](https://dev.mysql.com/downloads/connector/j/) (Included in `External_JARS/` directory)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

2. Add MySQL database credentials in the `DatabaseManager.java` file:

3. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).

4. Build the project.

5. Run the application:
   ```bash
   java -cp External_JARS/mysql-connector-j-8.0.32.jar:. src/App.java
   ```

## Features

- **User Authentication:** Sign up, login, and role-based access for admins, teachers, and students.
- **Course Management:** Admins and teachers can add, assign, and manage courses.
- **GUI Interface:** Built using Java Swing for a graphical user experience.
- **Database Connectivity:** Uses MySQL for data storage with custom Java utilities for database management.
- **Custom Utilities:** Utilities for data validation, image rendering, and data management.

## File Descriptions

- **App.java:** The main entry point for the application.
- **auth/Auth.java:** Handles user authentication logic.
- **models/course/** and **models/user/**: Contains model classes for courses and users (Admin, Student, Teacher, SystemUser).
- **pages/**: GUI classes for different user pages (Login, SignUp, Dashboard, etc.).
- **resources/**: Contains image assets used in the GUI.
- **util/**: Utility classes for database handling (`DatabaseManager.java`), data validation (`Validator.java`), and rendering custom UI components.


## Referance

The project has been taken from [here](https://github.com/R0shish/Course-Management-System) and has been modified as per requirements.
