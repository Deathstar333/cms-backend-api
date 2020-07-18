package com.wipro.springboot.cmsbackendapi.controller;

import com.wipro.springboot.cmsbackendapi.model.User;
import com.wipro.springboot.cmsbackendapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping( value = "api/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody User user) {
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        return userService.authenticate(user);
    }

    @RequestMapping( value = "api/register", method = RequestMethod.POST)
    public void register(@RequestBody User user) {
        userService.addUser(user);
    }
}
