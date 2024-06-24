package com.bway.springtestdemo.controller;

import com.bway.springtestdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    @GetMapping("/signup")
    public String signup(){
        return "SignUp";
    }

    @PostMapping("/signup")
    public String getData(@ModelAttribute User user, Model model){
        return "redirect:/login";
//        return "LoginForm";
    }
}
