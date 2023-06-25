package com.fdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fdemo.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {


    @Select("select * from user_order where user_id = #{id}")
    List<Order> getOrderByUserId(Long id);

}
