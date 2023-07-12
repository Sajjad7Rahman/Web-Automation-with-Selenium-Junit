# Web-Automation-with-Selenium-Junit

## Selenium Junit:
Selenium is a popular framework for automating web browsers which provides a suite of tools and libraries that allow testers and developers to automate web application testing across different browsers (Chrome Browser is used in this Project) and platforms. With Selenium, can write test scripts in various programming languages such as Java to interact with web elements, simulate user actions including perform assertions to verify the behavior of Web applications.

JUnit is a commonly used testing framework for Java applications which ensures a set of annotations, assertions, and test runners that enable developers to write and execute unit tests for Java code.

While these two technologies are using together, Selenium is used for Browser Automation while JUnit is used as the testing framework for organizing and running the Selenium Tests. In this Project, Junit annotations like @DisplayName for different Test cases, @Test to define the methods, @BeforeAll to define setup and @AfterAll to close the driver are used to verify the expected outcomes.

## Technology Used:
-Intellij

-Selenium

## Framework Used:
-Junit

## Pre-requisite/s:
-Java SDK 11

-Dependencies:

testImplementation platform('org.junit:junit-bom:5.9.1')

testImplementation 'org.junit.jupiter:junit-jupiter'

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.10.0'

## Website Used for this test:

Link: https://www.digitalunite.com/practice-webform-learners

![Capture_website](https://github.com/Sajjad7Rahman/Web-Automation-with-Selenium-Junit/assets/134221688/66294cf1-4d11-41a3-9b84-e7e67c9c0c52)
