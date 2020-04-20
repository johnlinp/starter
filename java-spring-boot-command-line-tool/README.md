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
$ vim src/main/resources/application.properties # update logging level
$ mvn spring-boot:run -Dspring-boot.run.arguments=--name=John
...
2020-04-20 10:16:36.597 DEBUG 93384 --- [           main] i.g.j.greeting.service.GreetingService   : start greet()
2020-04-20 10:16:36.598 DEBUG 93384 --- [           main] i.g.j.g.service.GreetingMessageService   : start generate()
2020-04-20 10:16:36.598 DEBUG 93384 --- [           main] i.g.j.g.service.GreetingMessageService   : end generate()
2020-04-20 10:16:36.598 DEBUG 93384 --- [           main] i.g.j.greeting.service.GreetingService   : begin to print
Welcome to Greeting!
Hello, John.
2020-04-20 10:16:36.598 DEBUG 93384 --- [           main] i.g.j.greeting.service.GreetingService   : end greet()
...
```

Also, you can run the unit tests by:

```
$ mvn test
```
