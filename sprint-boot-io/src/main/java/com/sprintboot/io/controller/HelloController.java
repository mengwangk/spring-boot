package com.sprintboot.io;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/greetings")
    public String index() {
        return "Greetings!";
    }

}