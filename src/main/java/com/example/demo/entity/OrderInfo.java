package com.example.demo.entity;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 10:00
 */
public class OrderInfo {
    public Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String buyName;
    public String buyGoods;

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public String getBuyGoods() {
        return buyGoods;
    }

    public void setBuyGoods(String buyGoods) {
        this.buyGoods = buyGoods;
    }
    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", buyName='" + buyName + '\'' +
                ", buyGoods='" + buyGoods + '\'' +
                '}';
    }

}
