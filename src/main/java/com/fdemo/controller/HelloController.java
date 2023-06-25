package com.fdemo.controller;

import com.fdemo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "nice to meet you1";
    }

    @PostMapping("/getuser")
    public String getUser(@RequestBody User user){
        System.out.print(user);
        return user.getName();
    }
}
