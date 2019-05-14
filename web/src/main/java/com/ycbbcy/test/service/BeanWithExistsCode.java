package com.ycbbcy.test.service;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * 指定spring boot结束运行的code
 */
@Component
public class BeanWithExistsCode implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 233;
    }
}
