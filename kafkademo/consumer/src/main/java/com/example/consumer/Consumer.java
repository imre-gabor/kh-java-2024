package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(id = "my-consumer", topics = "topic11")
    public void listen(String payload) {
        System.out.println(payload);
    }
}
