package com.example.demo.lambda;

import java.util.function.Consumer;

public interface SpendMoney {
    void buy(double money);
}

class Test{
    public static void buySth(double money,SpendMoney s){
        s.buy(money);
    }

    public static void busOne(double money, Consumer<Double> s){
            s.accept(money);
    }
    public static void main(String[] args) {
        buySth(4000,x-> System.out.println("问问马老师，为什么花了"+x+"元？？？"));
        busOne(5000,x->System.out.println("问问马老师，为什么花了"+x+"元？？？"));
    }
}