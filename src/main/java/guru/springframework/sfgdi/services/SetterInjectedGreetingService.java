package guru.springframework.sfgdi.services;

/**
 * @author john
 * @since 2/5/22
 **/
//@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
