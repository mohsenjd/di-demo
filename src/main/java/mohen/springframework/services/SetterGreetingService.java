package mohen.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreetings(){
        return "Hello- I am injected via setter";
    }
}
