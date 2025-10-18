package guru.springframework.spring_6_di.controllers;

import guru.springframework.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();

        /*
        We need this line! Without this we would get a null pointer exception
         */
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {

        System.out.println(setterInjectedController.sayHello());
    }
}