package com.ycbbcy.test.service;

import com.ycbbcy.test.utils.ArrayUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 此处代码在SpringApplication启动后仅执行一次
 *
 * @see org.springframework.boot.CommandLineRunner
 */
@Slf4j
@Component
public class CustomerApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] sArgs = args.getSourceArgs();
        log.info("执行Spring ApplicationRunner，{}", ArrayUtils.join(sArgs, ","));
    }
}
