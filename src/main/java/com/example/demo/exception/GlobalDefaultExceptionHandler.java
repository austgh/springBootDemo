package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by think on 2021/2/18.
 * Spring boot 全局异常捕捉
 * 在一个项目中的异常我们我们都会统一进行处理的，那么如何进行统一进行处理呢？
 * 新建一个类 GlobalDefaultExceptionHandler，
 * 在 class 注解上@ControllerAdvice,
 * @CONTROLEADVICE:即把 @CONTROLERADVICE 注解 内部 使用 @EXCEPTIONHANDLER
 * @INITBINDER @MODELATRIBUTE 注解的方法 应 用到所有的 @REQUESTMAPPING注解的方法。
 * 非常简单，不过只有当使用
 * @EXCEPTIoNHANDLER 最有用,另外两个用处不大。
 * 在方法上注解上@ExceptionHandler(value = Exception.class)
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {
        //打印异常信息：
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
    }
}
