/*
 * Copyright (c) 2017 Nascent 版权所有
 * Nascent Co. Ltd. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of Nascent Co. Ltd.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with Nascent Co. Ltd
 */
package com.ycbbcy.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zsf
 * @history 1.0.0 2019/4/23 15:34 created by zsf
 * @since 2019/4/23 15:34
 */
@RestController
@RequestMapping
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "Hello World";
    }
}
