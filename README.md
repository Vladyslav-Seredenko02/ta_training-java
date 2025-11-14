1. I created three scenarios in one feature file.
2. I tried to do parallel execution using JUnit 5 + Cucumber 7,
so I added 'junit-platform.properties' file, and related dependencies, 
but it didn't work for some reason.
3. I created logins using 'log4j2' for test.
4. As Data Provider, I used Cucumber`s 'Scenario Outline' feature,
with its built-in capabilities to implement a parametrized test.
5. My test supports two browsers (Edge,Chrome),
which sets through the 'Scenario Outline' in Cucumber.
I also encountered an issue where I was unable to launch the Edge browser through the dependency.
I resolved it by providing the direct path to the Edge driver. 
PLEASE PAY ATTENTION TO THIS PART, AS IT MAY AFFECT THE EXECUTION.
6. For assertions, I used Hamcrest library.