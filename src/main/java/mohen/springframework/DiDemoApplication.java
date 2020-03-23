package mohen.springframework;

import mohen.springframework.controllers.ConstructorInjectedController;
import mohen.springframework.controllers.MyController;
import mohen.springframework.controllers.PropertyInjectedController;
import mohen.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ac.getBean("myController");


        System.out.println(myController.hello());
        System.out.println(ac.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ac.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ac.getBean(ConstructorInjectedController.class).sayHello());
    }

}
