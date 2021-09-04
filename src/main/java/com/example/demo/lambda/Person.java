package com.example.demo.lambda;

/**
 * Created by think on 2020/11/29.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }
    public Person(){

    }
    public String getName() {
        return name;
    }
    public static Person build(String name){
            Person p=new Person();
            p.setName(name);
            return p;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
