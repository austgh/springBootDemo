package com.example.demo.removeDuplicates;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author think
 * @date 2022年12月05日 16:30
 */
@Service(value = "InternalUserCart")
public class InternalUserCart extends AbstractCart{
    @Override
    protected void processCouponPrice(long userId, Item item) {
        item.setCouponPrice(BigDecimal.ZERO);
    }

    @Override
    protected void processDeliveryPrice(long userId, Item item) {
        item.setDeliveryPrice(BigDecimal.ZERO);
    }
}
