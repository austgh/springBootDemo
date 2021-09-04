package com.example.demo.dao.mapper;

import com.example.demo.entity.OrderInfo;
import org.apache.ibatis.annotations.Insert;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 10:19
 */
public interface OrderInfoMapper {
    @Insert("insert into order_info(buyName,buyGoods)values(#{buyName},#{buyGoods})")
    public void insertSelective(OrderInfo orderInfo);
}
