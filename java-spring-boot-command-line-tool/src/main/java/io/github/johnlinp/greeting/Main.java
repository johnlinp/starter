package io.github.johnlinp.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import io.github.johnlinp.greeting.service.GreetingService;

@SpringBootApplication
public class Main implements CommandLineRunner
{
    private final GreetingService greetingService;

    @Autowired
    public Main (GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public static void main (String[] args)
    {
        new SpringApplicationBuilder(Main.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run (String... args)
    {
        greetingService.greet();
    }
}
