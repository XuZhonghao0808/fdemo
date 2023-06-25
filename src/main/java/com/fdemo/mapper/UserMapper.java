package com.fdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fdemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {


    @Select("select * from user")
    @Results({
        @Result(property = "id",column = "id"),
        @Result(property = "orders",column = "id",javaType = List.class,
                many = @Many(select = "com.fdemo.mapper.OrderMapper.getOrderByUserId")),
        @Result(property = "name",column = "name"),
        @Result(property = "password",column = "password"),
        @Result(property = "email",column = "email"),
        @Result(property = "phone",column = "phone"),
        @Result(property = "address",column = "address")
    })
    List<User> getUserAndOrder();
}
