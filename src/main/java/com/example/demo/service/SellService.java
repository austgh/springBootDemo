package com.example.demo.service;

import com.example.demo.dao.mapper.OrderInfoMapper;
import com.example.demo.dao.mapper.ProductMapper;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/24 9:40
 */
@Service
public class SellService {
    /**
     * 公平锁
     */
    private final Lock lock = new ReentrantLock(true);
    @Autowired
    ProductMapper productMapper;
    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    public void sellProduct() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "：抢到锁啦，进入方法");
            int a=1/0;
            Product product = productMapper.selectByPrimaryKey(1);
            Integer productCount = product.getProductCount();
            System.out.println(Thread.currentThread().getName() + ":当前库存=" + productCount);
            if (productCount > 0) {
                Product updateProduct = new Product();
                updateProduct.setId(product.getId());
                updateProduct.setProductCount(productCount - 1);
                productMapper.updateByPrimaryKeySelective(updateProduct);
                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setBuyName(Thread.currentThread().getName());
                orderInfo.setBuyGoods(product.getProductName());
                orderInfoMapper.insertSelective(orderInfo);
                System.out.println(Thread.currentThread().getName() + ":减库存，创建订单完成!");
            } else {
                System.out.println(Thread.currentThread().getName() + ":没有库存了!");
            }
            System.out.println(Thread.currentThread().getName() + ":释放锁!");
        } finally {
            lock.unlock();
        }
    }
    public void lockProduct(){
//        lock.lock();

    }
}
