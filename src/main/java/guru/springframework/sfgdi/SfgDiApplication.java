package guru.springframework.sfgdi;


import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.service.I18nEnglishGreetingService;
import guru.springframework.sfgdi.service.PrototypeBean;
import guru.springframework.sfgdi.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.springframework.pets","guru.springframework.sfgdi" })
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        /* Spring is providing the myController object for us
         *  This is the Dependency Injection
         *  spring.profiles.active=ES
         * */

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        /* Based on the active profile defined in the application.properties,
         *  it will display the message from English or Spanish Bean
         * */
        System.out.println(" --- I18nController Bean");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(" --- Primary Bean");
        System.out.println(myController.sayHello());
        System.out.println(" --- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.greetingService.sayGreeting());

        System.out.println(" --- Setter Injected");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println(" --- Contructor Injected");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("------- Bean Scope ----------");
        System.out.println("Singleton Bean is created only once at the startup. Check the creation log:\n======");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println("Singleton Bean 1: " + singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println("Singleton Bean 2: " + singletonBean2.getMyScope());

        System.out.println("Prototype Bean is created each type an object is needed. Check the log below:\n======");
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println("Prototype Bean 1: "+prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2  = ctx.getBean(PrototypeBean.class);
        System.out.println("Prototype Bean 2: "+prototypeBean2.getMyScope());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("FakeDatasource : \n-------------------\nUsername : "+fakeDataSource.getUsername());
        System.out.println("Pasword: "+fakeDataSource.getPassword());
        System.out.println("URL: "+fakeDataSource.getJdbcurl());
        System.out.println("-------------------");

    }

}
