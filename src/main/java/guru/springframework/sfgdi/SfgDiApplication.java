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
        *  spring.profiles.active=ES
        * */

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        /* Based on the active profile defined in the application.properties,
        *  it will display the message from English or Spanish Bean
        * */
        System.out.println(" --- I18nController Bean");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(" --- Primary Bean");
        System.out.println(myController.sayHello());
        System.out.println(" --- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.greetingService.sayGreeting());

        System.out.println(" --- Setter Injected");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println(" --- Contructor Injected");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}
