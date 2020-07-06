package com.mohanty.SpringBootHibernate.controller;

import com.mohanty.SpringBootHibernate.models.User;
import com.mohanty.SpringBootHibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserService userService ;

    @GetMapping(value="/users", headers="Accept=application/json")
    public List<User> getAllUsers() {
        return  userService.getAllUsers();
    }
}
