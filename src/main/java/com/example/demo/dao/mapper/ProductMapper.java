package com.example.demo.dao.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 10:19
 */
public interface ProductMapper {
    @Select("SELECT * FROM product")
    public Product selectByPrimaryKey(Integer integer);
    @Update("UPDATE product SET productCount=#{productCount} WHERE id =#{id}")
    public void updateByPrimaryKeySelective(Product product);
}
