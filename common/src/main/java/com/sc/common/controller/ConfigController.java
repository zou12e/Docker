package com.sc.common.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value(value = "${name}")
    private String name;

    @Value(value = "${test1}")
    private String test1;


    @GetMapping("/test")
    public String test() {
        return "test: " + name  + test1;
    }
}
