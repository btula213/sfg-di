package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property : "+getClass().getSimpleName() ;
    }
}
