package guru.springframework.spring_6_di.controllers;

import guru.springframework.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController((new GreetingServiceImpl()));
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());

    }
}