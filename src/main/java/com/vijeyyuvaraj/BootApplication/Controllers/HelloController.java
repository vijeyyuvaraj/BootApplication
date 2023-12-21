package com.vijeyyuvaraj.BootApplication.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcomeMethod(){
        return " Welcome to Boot Application!!! ";
    }

}
