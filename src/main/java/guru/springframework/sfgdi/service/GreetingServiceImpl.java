package guru.springframework.sfgdi.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World : "+getClass().getSimpleName() ;
    }
}
