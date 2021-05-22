package com.use.user.service.controller;


import com.use.user.service.repository.User;
import com.use.user.service.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //9002
    @Autowired
    UserInfo userInfo;

    @GetMapping(value = "/get_users")
    public List<User> getAllUsers() {
        return userInfo.getAllUsers();
    }

    @PostMapping(value = "/add_user")
    public User addUser(@RequestBody User user) {
        return userInfo.addUser(user);
    }
}
