package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author john
 * @since 21/12/2023
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Create Singleton Bean!!!!");
    }

    public String getMyScope(){
        return ConfigurableBeanFactory.SCOPE_SINGLETON;
    }
}
