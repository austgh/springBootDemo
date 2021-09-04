package com.example.demo.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Author think
 * @Date 2021/7/30 10:29
 * @Version 1.0
 */
public class T06_01_CompletableFuture {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        CompletableFuture<Double> futureTM = CompletableFuture.supplyAsync(() -> priceTM());
        CompletableFuture<Double> futureTB = CompletableFuture.supplyAsync(() -> priceTB());
        CompletableFuture<Double> futureJD = CompletableFuture.supplyAsync(() -> priceJD());
        CompletableFuture.allOf(futureTM,futureTB,futureJD).join();
        long end = System.currentTimeMillis();
        System.out.println("use completable future !"+(end-start)/1000);
        CompletableFuture.supplyAsync(() -> priceJD()).thenApply(String::valueOf).thenApply(str -> "price" + str).thenAccept(System.out::println);
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static double priceJD() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1.00;
    }



    private static double priceTB() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2.00;
    }

    private static double priceTM() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 3.00;
    }
}
