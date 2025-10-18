package guru.springframework.spring_6_di.controllers;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import guru.springframework.spring_6_di.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
