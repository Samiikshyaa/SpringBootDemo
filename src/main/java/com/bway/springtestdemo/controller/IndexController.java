package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //used to process request.
public class IndexController {

    @GetMapping("/") //root url
    public String index(){

        return "Index";
    }
}
