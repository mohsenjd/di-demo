package mohen.springframework.controllers;

import mohen.springframework.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreetings();
    }
}
