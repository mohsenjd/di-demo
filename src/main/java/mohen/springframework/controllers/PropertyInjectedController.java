package mohen.springframework.controllers;

/*created by mohsen on 17/02/2020*/

import mohen.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public  String sayHello() {
        return greetingService.sayGreetings();
    }

}
