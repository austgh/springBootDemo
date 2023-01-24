package com.example.demo.removeDuplicates;

import java.math.BigDecimal;

/**
 * @author think
 * @date 2022年12月06日 5:38
 * 模拟商品信息
 */
public  class Db {
    public static BigDecimal getItemPrice(Object key){
        return new BigDecimal("1");
    }

    public static String getUserCategory(Object key){
        return "1";
    }

    public static int getUserCouponPercent(Object key){
        return 1;
    }

}
