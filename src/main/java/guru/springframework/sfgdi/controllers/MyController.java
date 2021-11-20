package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MyController {

    private final GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
