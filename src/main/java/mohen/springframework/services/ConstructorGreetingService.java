package mohen.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello - I am injected via the constructor";
    }

}
