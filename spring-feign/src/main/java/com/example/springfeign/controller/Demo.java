package com.example.springfeign.controller;

import com.example.springfeign.client.DebugClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Demo {
    @Resource
    DebugClient debugClient;

    @GetMapping("/req-debug-another")
    public Object reqDebugAnother() {
        return this.debugClient.another();
    }
}
