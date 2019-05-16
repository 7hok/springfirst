package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
   public String home(){
        return "home";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
