package com.github.app.user.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/info/{userId}")
    public Map<String,Object> userInfo(@PathVariable("userId") String userId){
        Map<String,Object> user = new HashMap<>();
        user.put("userId",userId == null? "100001": userId);
        user.put("name","张三");
        user.put("address","北京市海淀区");
        return user;
    }

}
