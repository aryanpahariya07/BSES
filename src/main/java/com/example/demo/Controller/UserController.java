package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;


@Controller
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/")
    public String getMethodName(Model model) {
        User user =new User();
        model.addAttribute("user", user);
        return "home";
    } 

    @RequestMapping("/save")
    public String saved(@ModelAttribute("user") User user) {
        service.save(user);

        return "saved successfully";
    }

    @RequestMapping("/other")
    public String other(@RequestBody String s, Model m) {
        User user=service.getbyid(s);
        m.addAttribute("user", user);

        return "other";
    }
}