package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/test/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
