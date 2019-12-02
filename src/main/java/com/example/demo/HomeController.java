package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String loadHomepage(){
        return "Homepage";
    }
    @RequestMapping("/CVpage")
    public String loadCVpage(){
        return "CV";
    }
    @RequestMapping("/Homepage")
    public String loadHome(){
        return "Homepage";
    }
    @RequestMapping("/Hobbypage")
    public String loadHobby(){
        return "Hobbies";
    }

}















