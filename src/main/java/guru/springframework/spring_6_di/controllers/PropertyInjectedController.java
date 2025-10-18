package guru.springframework.spring_6_di.controllers;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import guru.springframework.spring_6_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    /*
        There is no constructor this time! (like in MyController)
        We only have a property (greetingService) here.
    */

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
