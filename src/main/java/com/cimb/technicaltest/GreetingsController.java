package com.cimb.technicaltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @RequestMapping("/")
    public String Greetings(){
        return "Hello guys!";
    }

}
