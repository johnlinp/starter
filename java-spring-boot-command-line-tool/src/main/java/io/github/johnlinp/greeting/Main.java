package io.github.johnlinp.greeting;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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

    @Value("${verbose:false}")
    private boolean verbose;

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
        setup();
        greetingService.greet();
    }

    private void setup ()
    {
        BasicConfigurator.configure();
        if (!verbose) {
            Logger.getRootLogger().setLevel(Level.INFO);
        }
    }
}
