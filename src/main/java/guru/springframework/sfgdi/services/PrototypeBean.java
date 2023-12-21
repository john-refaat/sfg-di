package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author john
 * @since 21/12/2023
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating Prototype Bean!!!!!!");
    }

    public String getMyScope() {
        return ConfigurableBeanFactory.SCOPE_PROTOTYPE;
    }
}
