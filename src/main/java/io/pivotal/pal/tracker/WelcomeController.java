package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;

@RestController
public class WelcomeController {
    private String name;

    WelcomeController() {
    }

    @Autowired
    public WelcomeController(@Value("${welcome_message:NOT SET}") String name){
        this.name = name;
    }
    @GetMapping("/")
    public String sayHello() {
        return name;
    }
}