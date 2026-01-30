
# Povio AQA Assignment – Test Automation Project

This project contains end-to-end automated tests for the Povio demo application using Selenium WebDriver, Java, and TestNG.

The goal of this framework is to verify core user flows such as registration, login, and campaign management.

---

# Tech Stack

- Java 11
- Selenium
- TestNG
- Maven
- WebDriverManager
- IntelliJ IDEA
- Chrome browser

---

# Project Structure

povio-aqa-assignment
│
├── src
│ ├── main
│ │ └── java
│ │ └── pages # Page Object classes
│ │
│ └── test
│ └── java
│ ├── base # BaseTest setup
│ ├── e2e # End-to-end tests
│ └── utils # Data cleanup helpers
│
├── pom.xml
├── TEST_PLAN.md
└── README.md

---

# Prerequisites

Before running the project, make sure you have:

- Java 11 installed
- Maven installed
- Google Chrome installed
- IntelliJ IDEA

---

# Setup Instructions

### 1. Clone the project
git clone <>
cd povio-aqa-assignment

### 2. Open the project in IntelliJ
- Open IntelliJ
- Select **Open**
- Choose the project folder
- Let Maven download dependencies

---

# Running the Tests

### Option 1: Run all tests
From IntelliJ:
- Right-click on `src/test/java`
- Click **Run 'All Tests'**

### Option 2: Run a specific test
- Open any test class (example: `RegistrationTest.java`)
- Click the green Run button next to the class

---

# Browser Setup

ChromeDriver is managed automatically using WebDriverManager.  
No manual driver download is required.

---

# Reports

Test results are shown in:
- Allure Reports: For a detailed visual breakdown of the test cases and execution trends, open target/site/allure-maven-plugin/index.html in your browser.
- IntelliJ test runner
- Console logs

---

# Notes

- Each test starts with a fresh browser session.
- Data cleanup runs after tests to keep the environment clean.
- Page Object Model (POM) is used for better structure and readability.
- Explicit waits are used instead of Thread.sleep.

---

# Author

Candidate: Drilona Gashi

# povio-aqa-assignment
QA automation assignment – Selenium, Java, Maven

