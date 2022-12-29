package com.example.demo.removeDuplicates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @author think
 * @date 2022年12月05日 16:54
 */
@RestController
public class RightController {
    @Autowired
    public ApplicationContext applicationContext;

    @GetMapping("right")
    public Cart right(@RequestParam("userId") int userId) {
        String userCategory = Db.getUserCategory(userId);
        AbstractCart cart = (AbstractCart) applicationContext.getBean(userCategory + "UserCart");
        //处理赋值问题
        Map<Long, Integer> items = new HashMap<Long, Integer>();
        return cart.process(userId, items);
    }
}
