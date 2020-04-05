package mohen.springframework;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I am in life cycle bean constructor");
    }
    @Override
    public void afterPropertiesSet(){
        System.out.println("## The life cycle bean has its properties set! ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("my bean name is : " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## the life cycle has been terminated! ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##Application context has been set");

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## the post construct annotated method has been called");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("## the pre destroy annotated method has been set");
    }
    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }
    public void afterInit(){
        System.out.println("## after init - called by bean post processor");
    }
}

