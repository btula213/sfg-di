package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
//Removed the class level annotations and put in the Configuration file.
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World from the PRIMARY BEAN : "+getClass().getSimpleName();
    }
}
