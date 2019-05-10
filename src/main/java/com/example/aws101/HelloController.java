package com.example.aws101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Public Cloud";
    }

    @GetMapping("/country/{code}")
    public String getCountryName(@PathVariable String code) {
        return helloService.getCountryName(code);
    }
}
