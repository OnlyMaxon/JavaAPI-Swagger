package com.example.javaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to Task 1");
        model.addAttribute("message", "This is a Spring MVC + Thymeleaf page");
        return "greeting";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("title", "Hello Page");
        model.addAttribute("message", "Hello from /hello endpoint");
        return "greeting";
    }
}
