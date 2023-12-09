package com.example.springfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${service.debug.url}", name = "debugClient")
@Component
public interface DebugClient {
    @GetMapping("/demo/another")
    public String another();
}
