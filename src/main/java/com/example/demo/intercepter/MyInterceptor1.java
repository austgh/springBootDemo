package com.example.demo.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by think on 2021/2/18.
 */
public class MyInterceptor1 implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(MyInterceptor1.class);

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
                                Exception exception)  throws Exception {
        logger.info("afterCompletion...");
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
                           ModelAndView modelAndView)  throws Exception {
        logger.info("postHandle...");
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
            throws Exception {
        logger.info("preHandle...");
        return true ;
    }
}
