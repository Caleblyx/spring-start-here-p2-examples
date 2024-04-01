package com.example.gswsp2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.gswsp2.processors.LoginProcessor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class LoginController {
    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }
    
    @PostMapping("/")
    public String postMethodName(@RequestParam String username, @RequestParam String password, Model model) {
        //TODO: process POST request
        LoginProcessor loginProcessor = new LoginProcessor(username, password);

        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            model.addAttribute("message", "You are now logged in.");
        } else {
            model.addAttribute("message", "Login failed!");
        }

        return "login.html";
    }
    
}
