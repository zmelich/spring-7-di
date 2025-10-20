package guru.springframework.spring_6_di.services;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!";
    }
}
