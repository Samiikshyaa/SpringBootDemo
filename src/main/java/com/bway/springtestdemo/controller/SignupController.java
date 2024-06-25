package com.bway.springtestdemo.controller;

import com.bway.springtestdemo.model.User;
import com.bway.springtestdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepo;
    @GetMapping("/signup")
    public String signup(){
        return "SignUp";
    }

    @PostMapping("/signup")
    public String getData(@ModelAttribute User user, Model model){
        userRepo.save(user);
        return "redirect:/login";
//        return "LoginForm";
    }
}
