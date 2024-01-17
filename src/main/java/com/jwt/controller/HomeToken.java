package com.jwt.controller;

import com.jwt.model.User;
import com.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeToken {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
