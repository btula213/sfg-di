package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Folks!\n+++++++++++++++++++");
        return "Hi Folks!";
    }
}
