package com.fdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fdemo.entity.Order;
import com.fdemo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/getAllOrder")
    public Page getAllOrder(Integer pageNum,Integer pageSize){
        Page<Order> page = new Page<>(pageNum, pageSize);
        Page<Order> orderPage = orderMapper.selectPage(page, null);
        return orderPage;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insertOrder(Order order){
        return orderMapper.insert(order);
    }

    @GetMapping("/getOrderById")
    public String getOrderById(Long id){
        System.out.println(id);
        return orderMapper.selectById(id).toString();
    }
}
