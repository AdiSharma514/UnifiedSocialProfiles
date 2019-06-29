package com.gfg.major.SpringDataConsuming.controller;

import com.gfg.major.SpringDataConsuming.model.UserInfo;
import com.gfg.major.SpringDataConsuming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/codeforces/{handle}")
    public UserInfo getUserInfo(@PathVariable String handle){
        return userService.getUserInfo(handle);
    }

}
