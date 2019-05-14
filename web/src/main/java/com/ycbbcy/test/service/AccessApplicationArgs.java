package com.ycbbcy.test.service;

import com.ycbbcy.test.utils.ArrayUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * 读取application的运行参数
 */
@Component
@Slf4j
public class AccessApplicationArgs {

    @Autowired
    public AccessApplicationArgs(ApplicationArguments applicationArguments) {
        log.info("读取application的运行参数：{}", ArrayUtils.join(applicationArguments.getSourceArgs(), ","));
    }
}
