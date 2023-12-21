package guru.springframework.sfgdi.services;

/**
 * @author john
 * @since 2/5/22
 **/
//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}
