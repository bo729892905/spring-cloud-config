package com.rxb.springcloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ren.xiaobo on 2018/4/24.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${my-config}")
    private String name;

    @RequestMapping("/getName")
    public String getAppName() {
        return name;
    }
}
