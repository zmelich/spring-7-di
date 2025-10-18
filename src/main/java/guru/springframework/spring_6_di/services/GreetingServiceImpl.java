package guru.springframework.spring_6_di.services;


/*
Created by Zsolt Melich (BT - IVR team)
*/

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service";
    }
}
