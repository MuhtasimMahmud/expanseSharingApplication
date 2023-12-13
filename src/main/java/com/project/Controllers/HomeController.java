package com.project.Controllers;

import com.project.Repositories.UserReporsitory;
import com.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserReporsitory userReporsitory;



    @GetMapping("expanceSharingApplication/test")
    public String test(){

        User user = new User();
        user.setName("Mahmud");
        user.setEmail("mahmud@gmail.com");
        user.setManager(true);

        userReporsitory.save(user);

        return "home";
    }


    @GetMapping("expanceSharingApplication/test2")
    public String testUser(Model model){

        List<User> users = userReporsitory.findAll();
        model.addAttribute("users", users);

        return "testUser";
    }




}
