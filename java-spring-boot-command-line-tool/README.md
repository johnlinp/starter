# Java Spring Boot Command-line Tool


## greeting

This example is for demonstrating the basic argument parsing in Spring Boot.

You can try it with the following commands:

```
$ mvn spring-boot:run -Dspring-boot.run.arguments=--name=John
...
Hello, John.
...
$ mvn spring-boot:run -Dspring-boot.run.arguments=--loud=true,--name=John
...
HELLO, JOHN.
...
$ mvn spring-boot:run -Dspring-boot.run.arguments=--times=3,--name=John
...
Hello, John.
Hello, John.
Hello, John.
...
$ mvn spring-boot:run -Dspring-boot.run.arguments=--verbose=true,--name=John
...
0 [main] DEBUG io.github.johnlinp.greeting.service.GreetingService  - start greet()
0 [main] DEBUG io.github.johnlinp.greeting.service.GreetingMessageService  - start generate()
0 [main] DEBUG io.github.johnlinp.greeting.service.GreetingMessageService  - end generate()
0 [main] DEBUG io.github.johnlinp.greeting.service.GreetingService  - begin to print
Welcome to Greeting!
Hello, John.
1 [main] DEBUG io.github.johnlinp.greeting.service.GreetingService  - end greet()
...
```

Also, you can run the unit tests by:

```
$ mvn test
```
