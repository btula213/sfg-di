package guru.springframework.sfgdi;


import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        /* Spring is providing the myController object for us
        *  This is the Dependency Injection
        * */
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

//        System.out.println(" --- Property");
//        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");
//        System.out.println(propertyInjectedController.greetingService.sayGreeting());
//
//        System.out.println(" --- Setter Injected");
//        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//        System.out.println(setterInjectedController.getGreeting());
//
        System.out.println(" --- Contructor Injected");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
