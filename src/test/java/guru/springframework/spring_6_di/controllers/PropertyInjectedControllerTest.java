package guru.springframework.spring_6_di.controllers;

import guru.springframework.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {

        propertyInjectedController = new PropertyInjectedController();

        //Check the way we reference to greetingService! Like a property (not like a field)
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {

        System.out.println(propertyInjectedController.sayHello());

    }
}