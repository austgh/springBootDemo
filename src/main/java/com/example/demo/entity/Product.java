package com.example.demo.entity;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 9:50
 */
public class Product {
    public Integer id;
    public Integer productCount;
    public String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCount=" + productCount +
                ", productName='" + productName + '\'' +
                '}';
    }
}
