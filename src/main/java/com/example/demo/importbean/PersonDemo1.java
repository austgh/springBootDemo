package com.example.demo.importbean;

/**
 * @author qxt
 * @date 2022年12月29日 7:14 PM
 */
public class PersonDemo1 {
    private String name;

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "PersonDemo1{" +
                "name='" + name + '\'' +
                '}';
    }

}
