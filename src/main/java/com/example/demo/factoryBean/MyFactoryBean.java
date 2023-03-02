package com.example.demo.factoryBean;

import com.example.demo.entity.A;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author think
 * @version 1.0
 * @date 2021/8/30 10:49
 * getObject方法就是用来自定义生成bean对象逻辑的
 */
@Component
public class MyFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        A a=new A();
        return a;
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }

}
