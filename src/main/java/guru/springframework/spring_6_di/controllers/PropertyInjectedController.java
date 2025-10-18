package guru.springframework.spring_6_di.controllers;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import guru.springframework.spring_6_di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    /*
        There is no constructor this time! (like in MyController)
        We only have a property (greetingService) here.
    */

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
