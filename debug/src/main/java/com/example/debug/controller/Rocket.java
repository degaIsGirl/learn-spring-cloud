package com.example.debug.controller;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;

@RestController
@RequestMapping("/rocket")
public class Rocket {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    private final String DEBUG_TOPIC = "debug_topic";


    @GetMapping("/send")
    public Object send() {
        this.rocketMQTemplate.convertAndSend("sendMessage_topic", "Hello Word");
        Message message = new Message(DEBUG_TOPIC, ("this is send data " + Instant.now() + "").getBytes());
        SendResult sendResult = rocketMQTemplate.syncSend(DEBUG_TOPIC, message);
        return sendResult;
    }
}
