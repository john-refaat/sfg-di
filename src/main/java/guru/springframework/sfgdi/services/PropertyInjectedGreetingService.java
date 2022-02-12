package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author john
 * @since 2/5/22
 **/
@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
