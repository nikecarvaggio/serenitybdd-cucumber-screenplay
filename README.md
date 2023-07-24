# Running Automation Tests with Serenity BDD, Java 16, and Gradle 8.1

This README file provides instructions for setting up and running automation tests using Serenity BDD with Java 16 and Gradle 8.1.

## Explanation Screenplay Pattern

### Screenplay Pattern

The Screenplay Pattern helps in designing test automation scenarios that are easy to understand, maintain, and extend. It consists of three main elements:

1. **Actors**: In the Screenplay Pattern, tests are driven by actors, representing users or personas who interact with the application. Actors perform tasks in the test scenarios.

2. **Tasks**: A task is a single atomic action or interaction that an actor can perform in the application. Tasks encapsulate the user actions and provide a clear, reusable abstraction for interactions.

3. **Abilities**: Abilities represent what an actor can do, such as browsing a web page, interacting with web elements, or reading data from files. It helps to decouple the test code from the implementation details.

4. **Questions**: Are the assertions to define if one task or test case finished successfully

Using the Screenplay Pattern in Serenity BDD, test scenarios are written in a more human-readable and maintainable format. The pattern promotes better collaboration between testers, developers, and business stakeholders, as it focuses on expressing test scenarios in a clear and understandable manner.

With Serenity BDD and the Screenplay Pattern, teams can build robust test suites that are easier to manage, provide clear reporting, and deliver confidence in the quality of the software being tested.

## Prerequisites

Before proceeding, ensure you have the following installed on your system:

- Java Development Kit (JDK) 16 or higher
- Gradle 8.1 or higher
- Your preferred Integrated Development Environment (IDE) such as IntelliJ or Eclipse

## Project Setup

- Unzip the project repository to your local machine,
- Open the project in your preferred IDE.

## Running the Tests

You can run the tests using Gradle. Open a terminal (or command prompt) and navigate to your project directory.

1. To run all the tests, use the following command:

`gradlew clean test`
or 
`gradle clean test`

To run a specific test class, use the following command:

`gradle clean test --tests="com.co.globant.YourTest"`
or
`gradlew clean test --tests="com.co.globant.YourTest"`

## View Reports

After running the tests, Serenity BDD generates test reports in the /target/index.html directory. Open the HTML report in your web browser to view the results.

That's it! You should now be able to set up and run your automation tests with Serenity BDD, Java 16, and Gradle 8.1. 

**Happy testing!**

