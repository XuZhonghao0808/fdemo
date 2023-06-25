package com.fdemo.controller;

import com.fdemo.entity.User;
import com.fdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getUserAndOrder")
    public String getUserAndOrder(){
        return userMapper.getUserAndOrder().toString();
    }

    @GetMapping("/getall")
    public List getAllUser(){
        return userMapper.selectList(null);
    }

    @PostMapping( "/insert")
    public int insert(User user){
        System.out.println(user);
        return userMapper.insert(user);
    }
}
