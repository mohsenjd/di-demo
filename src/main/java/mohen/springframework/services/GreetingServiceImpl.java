package mohen.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String GURUS = "Hello Gurus!!!";
    @Override
    public String sayGreetings(){
        return GURUS;
    }
}
