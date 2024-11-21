package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/api/produce")
    public void produce(){
        kafkaTemplate.send("topic11", "test");
    }
}