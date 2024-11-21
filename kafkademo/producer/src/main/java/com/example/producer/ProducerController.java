package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    int key = 0;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate2;

    @GetMapping("/api/produce")
    public void produce(){
        kafkaTemplate.send("topic11", String.valueOf(key++), "test");
        kafkaTemplate2.send("topic12", new MyMessage(10, 20.0, "abcd"));
    }
}
