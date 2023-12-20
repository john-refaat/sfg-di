package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author john
 * @since 10/12/2023
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleDemoBean constructor.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean Name is: " + s);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Terminating LifeCycleBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## After Property Set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Setting Application Context");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The post construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Pre Destroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## Before Init");
    }

    public void afterInit() {
        System.out.println("## After Init");
    }
}
