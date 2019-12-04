package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String loadHomepage(){
        return "Homepage";
    }
    @RequestMapping("/Resumepage")
    public String loadResume(){
        return "Resume";
    }
    @RequestMapping("/Aboutmepage")
    public String loadAboutme(){
        return "Aboutme";
    }
    @RequestMapping("/Hobbypage")
    public String loadHobby(){
        return "Hobbies";
    }

    @RequestMapping("/portfoliopage")
    public String loadportfolio(){
        return "portfolio";
    }

}















