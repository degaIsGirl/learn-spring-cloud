package com.example.debug.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

    @GetMapping("/index")
    public String index(String name, @RequestHeader("AppName") String fuckHeader) {
        // 判断fuckHeader 是否为空
        return StringUtils.isEmpty(name) ? "empty" : name;
    }

    @GetMapping("/debug")
    public String debug() {
        return System.currentTimeMillis() + "";
    }

    @GetMapping("/another")
    public String another() {
        return System.currentTimeMillis() + " another";
    }
}
