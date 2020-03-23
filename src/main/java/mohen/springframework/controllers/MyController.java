package mohen.springframework.controllers;

import mohen.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;
    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String hello(){
        System.out.println("Helllo!");
        return greetingService.sayGreetings();
    }

}
