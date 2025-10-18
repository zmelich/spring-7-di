package guru.springframework.spring_6_di.services;


import org.springframework.stereotype.Service;

/*
Created by Zsolt Melich (BT - IVR team)
*/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service";
    }
}
