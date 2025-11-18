## Task description
Launch URL: https://www.saucedemo.com/
1. UC-1 Test Login form with empty credentials:
Type any credentials into "Username" and "Password" fields.
Clear the inputs.
Hit the "Login" button.
Check the error messages: "Username is required".
2. UC-2 Test Login form with credentials by passing Username:
Type any credentials in username.
Enter password.
Clear the "Password" input.
Hit the "Login" button.
Check the error messages: "Password is required".
3. UC-3 Test Login form with credentials by passing Username & Password:
Type credentials in username which are under Accepted username are sections.
Enter password as secret sauce.
Click on Login and validate the title "Swag Labs" in the dashboard.
Provide parallel execution, add logging for tests and use Data Provider to
parametrize tests. Make sure that all tasks are supported by these 3 conditions: UC-1;
UC-2; UC-3.
Please, add task description as README.md into your solution!
To perform the task use the various of additional options:
Test Automation tool: Selenium WebDriver;
Project Builder: Maven;
Browsers. 1) Edge; 2) Chrome;
Locators: XPath;
Test Runner: JUnit;
[Optional] Patterns: 1) Abstract Factory; 2) Adapter; 3) Decorator;
(Optional] Test automation approach: BDD;
Assertions: Hamcrest;
[Optional] Loggers: Log4j.

## What Was Implemented
1. I created three scenarios in one feature file UC-1, UC-2, UC-3.
2. In my framework I added Driver Factory which supports two drivers: Edge, Chrome.
3. I tried to do parallel execution using JUnit 5 + Cucumber 7,
so I added 'junit-platform.properties' file, and related dependency,
but it didn't work for some reason, so I didn`t solve the task.
4. I added logs using 'log4j2' library.
5. As Data Provider, I used Cucumber`s 'Scenario Outline'
with its built-in capabilities to implement a parametrized test.
6. My framework supports two browsers (Edge,Chrome),
which sets through the 'Scenario Outline' in Cucumber.
I also encountered an issue where I was unable to launch the Edge browser through the 'io.github.bonigarcia' dependency.
It was resolved by downloading Edge driver locally, and providing the direct path to it. If you get same
"java.net.UnknownHostException: msedgedriver.azureedge.net" exception from driver repository,
please set this driver locally as well.
!!!PLEASE PAY ATTENTION TO THIS PART, AS IT MAY AFFECT THE EXECUTION!!!
7. For assertions, I used Hamcrest library.