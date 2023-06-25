package com.fdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_order")
public class Order {

    @TableId(type = IdType.AUTO)
    private int id;

    private Long userId;

    private String orderName;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + userId +
                ", order_name='" + orderName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getUser_id() {
        return userId;
    }

    public void setUser_id(Long user_id) {
        this.userId = user_id;
    }

    public String getOrder_name() {
        return orderName;
    }

    public void setOrder_name(String order_name) {
        this.orderName = order_name;
    }
}
