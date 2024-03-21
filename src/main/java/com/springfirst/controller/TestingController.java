package com.springfirst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//The main url
//http://localhost:8080
@RestController
@RequestMapping("/api")

//The url to enter this class
//http://localhost:8080/api

public class TestingController {

    //The url to enter this function
    //http://localhost:8080/api/name
    @GetMapping("/name")
    public String getName()
    {
        return "i am muhannad" ;
    }
}
