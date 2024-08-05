package com.d5error.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @RequestMapping("/")
    public String homePage() {
        return "Hello World";
    }
}
