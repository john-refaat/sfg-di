package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author john
 * @since 2/5/22
 **/
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
