package com.example.demo.importbean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author qxt
 * @date 2022年12月29日 8:02 PM
 */
public class PersonDemoFactoryBean implements FactoryBean<PersonDemo1> {
    @Override
    public PersonDemo1 getObject() throws Exception {
        return new PersonDemo1();
    }

    @Override
    public Class<?> getObjectType() {
        return PersonDemo1.class;
    }
}
