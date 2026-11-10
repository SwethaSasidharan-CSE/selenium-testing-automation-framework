# Selenium Test Automation Framework

## Project Overview

This project is a Modular Test Automation Framework developed using Java, Selenium WebDriver, TestNG and Maven.

The framework follows a modular architecture to promote code reusability, maintainability and structured test execution. It is designed to automate web application functionality through reusable page classes, common libraries and test utilities.

## Technologies Used

- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Testing Framework:** TestNG
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub
- **Reporting:** ExtentReports

## Framework Architecture

The framework is organised into three main layers:

### 1. Common Library Layer
Contains reusable components and wrapper methods.

- CommonDriver – Browser driver management.
- ElementControl – Reusable web element interactions.
- configUtils – Configuration management.
- ReportUtils – Reporting utilities.
- ScreenshotUtils – Screenshot handling.

### 2. Application Logic Layer
Contains page classes responsible for application interactions.

- BasePage – Common page-level functionality.
- LoginPage – Login page locators and interaction methods.

### 3. Test Layer
Contains test classes responsible for executing and validating application functionality.

- BaseTest – Test setup and teardown.
- LoginTest – Login functionality test scenarios.

## Project Structure

```text
ModularFramework/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── com/guru99/
│   │       │   ├── pages/
│   │       │   │   ├── BasePage.java
│   │       │   │   └── LoginPage.java
│   │       │   │
│   │       │   └── commonLibs/
│   │       │       ├── implementation/
│   │       │       │   ├── CommonDriver.java
│   │       │       │   └── ElementControl.java
│   │       │       │
│   │       │       └── utils/
│   │       │           ├── configUtils.java
│   │       │           ├── ReportUtils.java
│   │       │           └── ScreenshotUtils.java
│   │
│   └── test/
│       ├── java/
│       │   └── com/guru99/tests/
│       │       ├── BaseTest.java
│       │       └── LoginTest.java
│       │
│       └── resources/
│
├── TestXMLFiles/
│   └── testing.xml
│
├── config/
├── drivers/
├── reports/
├── screenshots/
│
├── pom.xml
└── README.md
```

## Test Scenarios

The framework currently includes login functionality testing.

- Login test execution.
- Test execution using TestNG.
- Test result validation using TestNG assertions.

## Key Features

- Modular framework architecture.
- Reusable browser driver management.
- Page-level separation using page classes.
- Common utility methods.
- Maven dependency management.
- TestNG-based test execution.
- Configuration and reporting utilities.
- Screenshot utility support.

## Prerequisites

Make sure the following are installed:

- Java JDK
- IntelliJ IDEA
- Maven
- Git

## How to Clone the Repository

```bash
git clone https://github.com/SwethaSasidharan-CSE/selenium-testing-automation-framework.git
```

Open the cloned project in IntelliJ IDEA and allow Maven to resolve the dependencies.

## How to Execute the Tests

1. Open the project in IntelliJ IDEA.
2. Verify the Maven dependencies.
3. Configure the application URL and browser settings.
4. Open `TestXMLFiles/testing.xml`.
5. Right-click the XML file.
6. Select Run.

Alternatively, execute the TestNG suite through Maven if the suite is configured in the Maven build:

```bash
mvn test
```

## Future Enhancements

- Expand positive and negative login test coverage.
- Implement data-driven testing.
- Enhance HTML test reporting.
- Implement cross-browser testing.
- Integrate continuous testing using GitHub Actions.

## Author

**Swetha Sasidharan**

GitHub: https://github.com/SwethaSasidharan-CSE


