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

    @Value(value = "${t1}")
    private String t1;

    @Value(value = "${t2}")
    private String t2;


    @GetMapping("/test")
    public String test() {
        return "test: " + name  + test1 + "|" + t1  + " | " + t2;

    }
}
