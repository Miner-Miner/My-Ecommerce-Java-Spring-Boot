package com.miner_miner.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Controller is used for routing and redirect to html page
@Controller
public class HomeController {
    
    @GetMapping("/") // This is route
    public String index(){
        return "index"; // This is opening html page. index.html ->located in resources-templates
    }

    @GetMapping("/login") // This is route
    public String login(){
        return "login"; // This is opening html page. login.html ->located in resources-templates
    }

    @GetMapping("/register") // This is route
    public String register(){
        return "register"; // This is opening html page. login.html ->located in resources-templates
    }
}