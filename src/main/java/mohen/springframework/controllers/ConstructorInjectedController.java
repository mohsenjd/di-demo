package mohen.springframework.controllers;

import mohen.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    @Autowired
    public ConstructorInjectedController( GreetingService greetingService){
        this.greetingService = greetingService;
    }


}
