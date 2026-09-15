# BankApp Starter — Java 21 + Spring Boot

A small starter project for a Bank Fund Transfer training/demo application.

## Included

- Java 21
- Maven
- Spring Boot 4.1.1
- REST controller
- Service layer + business logic
- Spring Data JPA repository
- MySQL runtime database
- JUnit/Spring Boot testing support
- Mockito unit test
- Testcontainers + real MySQL integration test
- JaCoCo code coverage
- SonarQube Maven scanner
- Maven Surefire for unit tests
- Maven Failsafe for integration tests

## Requirements

- JDK 21
- Maven 3.6.3+
- Docker Desktop / Docker Engine for integration tests
- MySQL for local application runtime (not required for Testcontainers integration tests)
- SonarQube locally or remotely if you want static analysis

## Run unit tests only

```bash
mvn clean test
```

Unit tests are `*Test.java`. Integration tests are `*IT.java` and are excluded from Surefire.

## Run integration tests + coverage

Docker must be running.

```bash
mvn clean verify
```

Failsafe runs `*IT.java` during the integration-test/verify phases. Testcontainers starts a real MySQL container for `BankApplicationIT`.

JaCoCo report:

```text
target/site/jacoco/index.html
```

## Run the application

Configure local MySQL in `src/main/resources/application.properties`, then:

```bash
mvn spring-boot:run
```

API examples:

```text
GET  http://localhost:8090/accounts
GET  http://localhost:8090/accounts/1
POST http://localhost:8090/accounts/transfer
```

Transfer body:

```json
{
  "fromId": 1,
  "toId": 2,
  "amount": 200.00
}
```

## SonarQube

Start SonarQube separately, then provide the token without committing it to source control.

Example:

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=bankapp-starter \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=YOUR_TOKEN
```

Do not put the real SonarQube token in `pom.xml`, `application.properties`, or Git.

## Project structure

```text
src/main/java
└── com.example.bankapp
    ├── BankAppApplication.java
    └── account
        ├── Account.java
        ├── AccountRepository.java
        ├── AccountService.java
        ├── AccountServiceImpl.java
        ├── AccountController.java
        ├── AccountNotFoundException.java
        └── TransferRequest.java

src/test/java
└── com.example.bankapp.account
    ├── AccountServiceImplTest.java     # Unit test + Mockito
    └── BankApplicationIT.java          # Integration test + Testcontainers + MySQL
```

## Teaching progression

1. Start with the service unit test and Mockito.
2. Add REST/controller tests later.
3. Run the JPA integration test against real MySQL using Testcontainers.
4. Generate JaCoCo coverage.
5. Run SonarQube for static analysis and quality reporting.
6. Expand the application with the remaining BankApp features.
