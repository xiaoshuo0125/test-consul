package com.consul01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {

    @Value("${test}")
    private String wwstest;

    @RequestMapping("test01")
    public String rest01(){
        return wwstest;
    }
}
