package guru.springframework.spring_6_di.services;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm setting a greeting!";
    }
}
