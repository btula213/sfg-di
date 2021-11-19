package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Setter
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
