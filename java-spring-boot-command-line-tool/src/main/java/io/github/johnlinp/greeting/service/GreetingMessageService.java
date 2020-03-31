package io.github.johnlinp.greeting.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingMessageService
{
    private static final Logger logger = Logger.getLogger(GreetingMessageService.class);

    @Value("${name}")
    private String name;

    @Value("${loud:false}")
    private boolean loud;

    public String generate ()
    {
        logger.debug("start generate()");

        String message = String.format("Hello, %s.", name);

        if (loud) {
            message = message.toUpperCase();
        }

        logger.debug("end generate()");

        return message;
    }
}
