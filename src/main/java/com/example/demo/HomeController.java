package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class HomeController {

  
    private Human human;
    private Person person;

    @Autowired
    public HomeController(Human human,Person person) {
        this.human = human;
        this.person = person;
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return human.toString();
    }

    @GetMapping("/profile")
    @ResponseBody
    public String profile (){
        person.say();
        return "found me";
    }

    @RequestMapping("/index") 
    public String index(){
        return "index";
    }

    @PutMapping("/index")
    public String update(){
        return "home";
    }

   
}
