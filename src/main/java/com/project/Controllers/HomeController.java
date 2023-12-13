package com.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("expanceSharingApplication/home")
    public String home(){
        return "home";
    }





}
