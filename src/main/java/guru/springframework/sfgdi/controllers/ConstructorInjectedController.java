package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public  String getGreeting(){
        return greetingService.sayGreeting();
    }

}
