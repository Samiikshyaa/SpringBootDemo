package com.bway.springtestdemo.controller;

import com.bway.springtestdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginControler {
    @GetMapping("/login")
    public String login(){
        return "LoginForm";
    }

    @PostMapping("/login")
    public String post(@ModelAttribute User user, Model model){
        if(user.getUsername().equals("hari") && (user.getPassword().equals("123"))){
            model.addAttribute("uname",user.getUsername());
            return "Home";
        }else{
            model.addAttribute("Error","User not found!");
            return "LoginForm";
        }
    }
}
