package io.github.johnlinp.greeting.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class GreetingMessageServiceTest
{
    private GreetingMessageService greetingMessageService;

    @Before
    public void setUp ()
    {
        greetingMessageService = new GreetingMessageService();
    }

    @Test
    public void testBasic ()
    {
        ReflectionTestUtils.setField(greetingMessageService, "name", "John");
        assertThat(greetingMessageService.generate()).isEqualTo("Hello, John.");
    }

    @Test
    public void testLoud ()
    {
        ReflectionTestUtils.setField(greetingMessageService, "name", "John");
        ReflectionTestUtils.setField(greetingMessageService, "loud", true);
        assertThat(greetingMessageService.generate()).isEqualTo("HELLO, JOHN.");
    }
}
