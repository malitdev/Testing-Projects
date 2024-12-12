# BankXYZ
 Automation Project
 
 HOW IT WORKS
 
This project was developed using Java
Selenium using testNG Framework
Eclipse IDE V020-09 ((4.19.0) was used
The following plugins were installed:
- testNG Plugin

The following dependencies were used:
- ReportNG
- Log4j
- SeleniumHQ
- testNG

Directory structure:
- src/test/java: contains the packages:
   org.malitcode.elements - contains webelement locators
   org.malitcode.lib - contains libraries
   org.malitcode.listeners - contains listeners
   org.malitcode.pages - contains test functions for each test 
   org.malitcode.test - contains 3 test cases
   
- src/test/executables -: contains chrome driver for test execution
- test-output: contains report files
- target: maven generated class files
- pom.xml - contains dependencies


To run/execute the tests:
- Make sure chrome browser v91.0 is installed
- Open the project using Eclipse IDE
- Right click on "testng.xml" run as TestNG Suite

To view reports
- Open the "test-output > html" folder, right click index.html > properties , copy the Location and paste it on chrome 

NOTE:
- I am still adding functionalities such as screenshots and extend reports 
 
 
