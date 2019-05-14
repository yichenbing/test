package com.ycbbcy.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 启动配置
 */
@Configuration
@Slf4j
public class InitConfiguration {

    @Bean
    public ExitCodeGenerator injectExitCodeGenerator() {
        return () -> 213;
    }
}
