Petstore API Tests (Cucumber - Rest Assured) 
========================================

#### Codes and Tests Prepared by:
Alimjan Abliz

*QA Engineer *

alimdjan921@gmail.com


####This is automation suite designed to test the Swagger Pet store Api.

Selenium & Java based API automation suite utilising the BDD methodologies of Cucumber and Gherkin.
* Before run the test cases make sure you have [Java](http://www.java.com/) ( *1.8 or higher* ) and [Maven](http://maven.apache.org/) installed on your system.


###Tools & Dependencies
* Cucumber 
* Cucumber - Junit 
* Maven 
* Maven-Surefire-plugin 
* Maven-Cucumber-reporting 
    * Cucumber HTML Reports
* Gson
* Rest-assured
* Gherkin Language
* IntelliJ (IDE) 
* Java 


## Framework Structure

#### Test Run class:
    src/test/java/com/PetStore/runner/CukesRunner.java
- CukesRunner class - Control running the test suit

####  Test step definitions:
    src/test/java/com/PetStore/stepDefs
- Step Definition Feature File - Java class whereby the steps from the feature files are broken down to be coded into automation tests
- Hooks class - Set base URL.

#### Test Scenarios:  
    src/test/resources/feature
  - Feature File - The feature file specifies the steps in BDD language style

#### Utilities:
    src/test/java/com/PetStore/utilies
  - ConfigurationReader class - Gets important credential and parameters from the configuration file.

##### Dependency & Plugin:
    MasterCard_ApiTest/pom.xml
- Manage dependencies and plugins.

##### Important Credential:
    MasterCard_ApiTest/configuration.properties
- Store important credentials and parameters.
## Running Tests
In order to execute the automation suite navigate to the Project directory `PetStore-ApiTest/` within `Terminal Mac`/`CMD window` and run one of the commands below:
  ```
   -mvn clean verify
  ```
####Or Running Tests
* CukesRunner class
* feature file ( execute each scenario separately )
* mvn ( get html reports)
### Reporting
* Tests result in `HTML` report for each feature in `MasterCard_ApiTest/target/cucumber-html-reports`. 
* After the test execution you can find `HTML Test Reports` under `MasterCard_ApiTest/target/cucumber-html-reports` folder and open one of them on any browser.


2021 December

###End
