package com.example.demo.exception;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author think
 * @date 2021/7/26 21:58
 * @version 1.0
 * 当执行方式是execute时,可以看到堆栈异常的输出。
 *
 * 当执行方式是submit时,堆栈异常没有输出。但是调用Future.get()方法时，可以捕获到异常。
 *
 * 不会影响线程池里面其他线程的正常执行。
 *
 * 线程池会把这个线程移除掉，并创建一个新的线程放到线程池中。
 *
 * 不要背答案，要理解，要深入，上面说完后记得在问问面试官，需要我从源码的角度讲一讲吗?这逼装的，礼貌而不失风度。
 */

public class ExecutorsTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolTaskExecutor executorService=buildThreadPoolTaskExecutor();
//        executorService.execute(()->sayHi("execute"));
//
//        TimeUnit.SECONDS.sleep(10);
//
//        System.out.println("-------------------------");
        Future submit= executorService.submit(() -> sayHi("submit"));
        try {
            submit.get();//阻塞的吧？
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void sayHi(String name) {
        String printStr = "[thread-name:" + Thread.currentThread().getName() + ",执行方式:" + name + "]";
        System.out.println(printStr);
        throw new RuntimeException(printStr+",我异常了！哈哈哈！");
    }

    private static ThreadPoolTaskExecutor buildThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executorService=new ThreadPoolTaskExecutor();
        executorService.setThreadNamePrefix("公众号-why技术-");
        executorService.setCorePoolSize(5);
        executorService.setMaxPoolSize(10);
        executorService.setQueueCapacity(1000);
        executorService.setKeepAliveSeconds(30);
        executorService.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executorService.initialize();
        return executorService;
    }

//    public static void main(String[] args) {
//        ThreadPoolTaskExecutor executorService=buildThreadPoolTaskExecutor();
//        executorService.execute(()->sayHello("execute"));
//        executorService.execute(()->sayHello("execute"));
//        executorService.execute(()->sayHello("exception"));
//        executorService.execute(()->sayHello("execute"));
//        executorService.execute(()->sayHello("execute"));
//    }

    private static void sayHello(String name) {
        String printStr = "[thread-name:" + Thread.currentThread().getName() + ",执行方式:" + name + "]";
        if ("exception".equals(name)) {
            throw new RuntimeException(printStr + ",我异常了！哈哈哈！");
        } else {
            System.out.println(printStr);
        }
    }

}
