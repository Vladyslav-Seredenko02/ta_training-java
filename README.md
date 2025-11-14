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