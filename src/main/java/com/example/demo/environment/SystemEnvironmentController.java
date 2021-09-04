package com.example.demo.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by think on 2021/2/19.
 */
@RestController
@RequestMapping("/system")
public class SystemEnvironmentController  implements EnvironmentAware {
    private String java_home;
    private Logger logger = LoggerFactory.getLogger(SystemEnvironmentController.class);
    @RequestMapping("/javahome")
    public String getJAVAHOME() {
        return java_home;
    }
    @Override
    public void setEnvironment(Environment environment) {
        java_home = environment.getProperty("JAVA_HOME");
        logger.info("控制器中获取的系统环境变量：" + java_home);
    }
}
