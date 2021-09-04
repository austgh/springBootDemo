package com.example.demo;

import com.example.demo.intercepter.MyInterceptor1;
import com.example.demo.intercepter.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author think
 * @version 1.0
 * @date 2021/2/18
 */
@Configuration
public class MyWebAppConfig /*extends WebMvcConfigurerAdapter*/ implements WebMvcConfigurer {
    /**
     * 重写addInterceptors方法并为拦截器配置拦截规则
     * WebMvcConfigurerAdapter已经废弃
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
//排除路径
//      registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**").excludePathPatterns("/Hello");
//      super .addInterceptors(registry);
    }
}
