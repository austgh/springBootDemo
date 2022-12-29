package com.example.demo;

import com.example.demo.importbean.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
@ComponentScan(basePackages = "com.example.demo.importbean")
//@Import(PersonDemo1.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
@Configuration
//@Import(MyDeferredImportSelector.class)
class DemoApplicationTests {

    @Bean
    public PersonDemoFactoryBean personFactoryBean() {
        return new PersonDemoFactoryBean();
    }

    @Test
    void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    //2、@Componet + @ComponentScan
    @Test
    void test2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo bean = applicationContext.getBean(PersonDemo.class);
        System.out.println(bean);
    }
    @Test
    void test3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    @Test
    void test4() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    @Test
    void test5() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    @Test
    void test6() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    @Test
    void test7() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationTests.class);
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
    @Test
    void test8(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        MyBeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor = new MyBeanDefinitionRegistryPostProcessor();
        applicationContext.addBeanFactoryPostProcessor(beanDefinitionRegistryPostProcessor);
        applicationContext.refresh();
        PersonDemo1 bean = applicationContext.getBean(PersonDemo1.class);
        System.out.println(bean);
    }
}
