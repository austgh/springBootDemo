package com.example.demo.removeDuplicates;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author think
 * @date 2022年12月05日 16:28
 */
@Data
public class Item {
    //商品ID
    private long id;
    //商品数量
    private int quantity;
    //商品单价
    private BigDecimal price;
    //商品优惠
    private BigDecimal couponPrice;
    //商品运费
    private BigDecimal deliveryPrice;
}
