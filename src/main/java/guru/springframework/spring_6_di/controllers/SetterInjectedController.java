package guru.springframework.spring_6_di.controllers;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import guru.springframework.spring_6_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    //@Qualifier("setterGreetingBean")
    //@Autowired
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("I'm in the setter");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
