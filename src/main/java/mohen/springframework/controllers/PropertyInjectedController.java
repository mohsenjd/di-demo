package mohen.springframework.controllers;

/*created by mohsen on 17/02/2020*/

import mohen.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public  String sayHello() {
        return greetingService.sayGreetings();
    }

}
