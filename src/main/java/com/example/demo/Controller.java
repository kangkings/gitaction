package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/version")
    public String version(){
        System.out.println("테스트1회");
        return "v1";
    }
}
