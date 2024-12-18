package com.jwt_example.controllers;

import com.jwt_example.models.User;
import com.jwt_example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    //http://localhost:8081/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){

        return principal.getName();
    }
}
