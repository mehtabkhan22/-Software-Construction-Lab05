
# Software Construction Lab Task 05

## Designing Specifications: Preconditions and Postconditions


## Objectives

- To understand method specifications and behavioral equivalence.
- To implement and test fail-fast precondition validation.
- To understand mutation contracts.
- To distinguish between mutable and immutable return types.
- To differentiate between declarative and operational specifications.
- To implement the required methods using Java.
- To verify program behavior using JUnit 5 testing.

---

## Project Description

This project contains the implementation of the five tasks from **Lab Task 05: Designing Specifications: Preconditions and Postconditions**.

The project focuses on method specifications, behavioral equivalence, precondition validation, mutation contracts, immutability, and declarative and operational JavaDoc specifications.

---

## Tasks Implemented

### Task 1: Behavioral Equivalence

The `SearchStrategies.java` file contains two search methods:

- `findFirst(int[] arr, int val)` returns the index of the first occurrence of a value.
- `findLast(int[] arr, int val)` returns the index of the last occurrence of a value.

If the value is not found:

- `findFirst()` returns `arr.length`.
- `findLast()` returns `-1`.

JUnit tests are used to check cases where the methods produce different and similar results.

### Task 2: Failing Fast with Preconditions

The `MathUtils.java` file contains the following method:

```java
public static double calculateGravitationalPotentialEnergy(double altitude)
```

The method requires the altitude to be greater than or equal to zero.

If a negative altitude is provided, the method throws an `IllegalArgumentException`.

JUnit tests verify that invalid input is rejected correctly.

### Task 3: Mutation Contracts

The `ListFormatter.java` file contains two methods:

- `sortInPlace(List<String> lst)` sorts and modifies the original list.
- `toLowerCase(List<String> lst)` returns a new list containing lowercase strings without modifying the original list.

JUnit tests verify the difference between mutating and non-mutating methods.

### Task 4: Immutability

The `Authenticator` class demonstrates the difference between mutable and immutable return types.

- `getMitId(String username)` returns a mutable `char[]`. The returned array can modify the cached ID.
- `getMitIdSecure(String username)` returns the ID as a `String`. Since `String` is immutable, the caller cannot directly modify the cached value.

This task demonstrates why immutable return types provide a safer boundary between a class and its clients.

### Task 5: Declarative and Operational Specifications

The `joinStrings()` method contains two JavaDoc specifications:

- **Operational specification:** Describes the internal steps and implementation process.
- **Declarative specification:** Describes the expected final result without explaining the internal implementation.

The declarative specification is preferred because it focuses on what the method does instead of how it works.

---

## Project Structure

```text
LabTask05
│
├── src
│   ├── main
│   │   └── java
│   │       └── lab5
│   │           ├── SearchStrategies.java
│   │           ├── MathUtils.java
│   │           ├── ListFormatter.java
│   │           └── Authenticator.java
│   │
│   └── test
│       └── java
│           └── lab5
│               ├── SearchStrategiesTest.java
│               ├── MathUtilsTest.java
│               ├── ListFormatterTest.java
│               └── AuthenticatorTest.java
│
├── pom.xml
└── README.md
```

---

## Technologies Used

- Java
- JUnit 5
- Maven
- NetBeans IDE
- Git and GitHub

---

## Requirements

The following software is required to run this project:

1. Java Development Kit (JDK)
2. Apache Maven
3. NetBeans IDE or another Java IDE
4. Git, if the project is uploaded using Git

---

## How to Run the Project

### Using NetBeans

1. Open NetBeans IDE.
2. Open the project.
3. Right-click the project.
4. Select **Test**.
5. Wait for the JUnit test results.
6. Confirm that the tests pass successfully.

### Using Maven

Open a terminal in the project directory and run:

```bash
mvn test
```

To clean the project and run the tests again, use:

```bash
mvn clean test
```

---

## Testing

JUnit 5 tests were created to verify the following:

- First and last occurrence searching.
- Repeated and missing values.
- Negative altitude validation.
- Gravitational potential energy calculation.
- In-place list sorting.
- Lowercase conversion without changing the original list.
- Mutation of a returned character array.
- Protection provided by an immutable `String` return type.
- String joining behavior.

The project contains tests for all five tasks.

---

## Expected Result

After running the tests, the console should show that all tests have passed successfully.

Example:

```text
Tests run: 12
Failures: 0
Errors: 0
Skipped: 0
```

The exact output may vary depending on the IDE and Maven configuration.

---

## Learning Outcomes

After completing this lab, I learned how to:

- Write and understand method specifications.
- Identify behavioral differences between methods.
- Apply preconditions to validate input.
- Use `IllegalArgumentException` for invalid values.
- Differentiate between mutating and non-mutating methods.
- Understand the importance of immutable return types.
- Write declarative and operational JavaDoc specifications.
- Use JUnit 5 for testing Java programs.
- Run and verify tests using Maven and NetBeans.

---

## Reflection

This lab helped me understand how method specifications describe the expected behavior of a program. I learned that preconditions are useful for rejecting invalid input early and that mutation can unexpectedly affect original data. I also understood why immutable return types, such as `String`, are safer than mutable arrays.

One challenge was writing suitable JUnit tests for different behaviors, especially mutation and immutability. In the future, I will improve my testing skills by adding more boundary cases and negative tests.

---

## Author

**Muhammad Mehtab**
