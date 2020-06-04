package com.app.sfgdi.controllers;

import com.app.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
