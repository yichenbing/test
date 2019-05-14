package com.ycbbcy.test;

import com.ycbbcy.test.service.CustomerApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestApplication.class);
//         注入Spring ApplicationListener的方式之一
        application.addListeners(new CustomerApplicationListener());
//         是否添加命令行参数到环境变量中
//        application.setAddCommandLineProperties(false);
//         设置web环境
//        application.setWebApplicationType(WebApplicationType.SERVLET);
//        application.setApplicationContextClass(ServletWebServerApplicationContext.class);
        ConfigurableApplicationContext context = application.run(args);
//         可以停止spring boot，并获取exit code
//        int code = SpringApplication.exit(application.run(args));
//        System.exit(code);
    }

}
