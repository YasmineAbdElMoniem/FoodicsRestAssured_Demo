# Automated Testing using Selenium-Java and Rest-Assured

This repository contains automated test scripts for Rest-Assured for API testing

## Scenario 2: Test Foodics Endpoints

**Test Cases**

1. Login API request with valid credentials and Get Access Token
2. Verify that the access token is not empty.
3. Retrieve user information from the WhoAmI API using the access token.
4. Perform a logout API request using the access token.
5. Get the logout message from the API response.

**How to Run**

* ***Locally***

    1. Clone this repository to your local machine.
    2. Set up your Java environment with Selenium WebDriver and Rest-Assured.
    3. Open the project in your preferred Java IDE.
    4. Navigate to the test class for the Amazon scenario (e.g., AmazonShoppingTest.java) and run the test methods.


* ***On Cloud***
    1. Using GitHub Actions on .yml file

**Dependencies**

- Java
- Selenium WebDriverManager
- Rest-Assured
- TestNG (for test execution)
- Java Faker
- Allure Reports
- Maven
- GitHub Actions
