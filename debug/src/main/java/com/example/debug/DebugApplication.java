package com.example.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DebugApplication {

    public static void main(String[] args) {
        SpringApplication.run(DebugApplication.class, args);
    }

}
