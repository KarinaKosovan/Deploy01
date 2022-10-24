package it.develhope.Deploy01.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String get(@Value("${spring.devName}") String myName) {
        return myName;
    }
}
