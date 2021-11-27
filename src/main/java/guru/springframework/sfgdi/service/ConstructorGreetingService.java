package guru.springframework.sfgdi.service;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor: "+getClass().getSimpleName() ;
    }
}
