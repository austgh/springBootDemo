package com.example.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by think on 2021/2/18.
 */
@WebFilter(urlPatterns = "/*", filterName = "myFilter")
public class MyFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public void destroy() {
        logger.info("destroy()");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("doFilter()");
        logger.info("before filter");
        chain.doFilter(request, response);
        logger.info("after filter");
    }
    @Override
    public void init(FilterConfig config)  throws ServletException {
        logger.info("init()");
    }
}
