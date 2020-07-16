package com.wipro.springboot.cmsbackendapi.controller;

import com.wipro.springboot.cmsbackendapi.model.User;
import com.wipro.springboot.cmsbackendapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping( value = "api/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody User user) {
        System.out.println(user.toString());
        return userService.authenticate(user);
    }
}
