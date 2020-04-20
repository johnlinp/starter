package io.github.johnlinp.greeting.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
    private static final Logger logger = LogManager.getLogger(GreetingService.class);

    private final GreetingMessageService greetingMessageService;

    @Value("${greeting.welcome}")
    private String welcome;

    @Value("${times:1}")
    private int times;

    @Autowired
    public GreetingService (GreetingMessageService greetingMessageService)
    {
        this.greetingMessageService = greetingMessageService;
    }

    public void greet ()
    {
        logger.debug("start greet()");

        String message = greetingMessageService.generate();

        logger.debug("begin to print");

        System.out.println(welcome);
        for (int i = 0; i < times; ++i) {
            System.out.println(message);
        }

        logger.debug("end greet()");
    }
}
