package com.ycbbcy.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 随机值
 */
@Component
@Slf4j
public class RandomValue {

    @Value("${random.uuid}")
    private String rv;

    @PostConstruct
    public void init() {
        log.info("注入随机属性值：{}", rv);
    }
}
