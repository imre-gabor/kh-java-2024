package com.example.consumer;

import com.example.producer.MyMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(id = "my-consumer", topics = "topic11", containerFactory = "kafkaListenerContainerFactory1")
    public void listen(String payload) {
        System.out.println(payload);
    }

    @KafkaListener(id = "mymessage-consumer", topics = "topic12", containerFactory = "kafkaListenerContainerFactory2")
    public void listen2(MyMessage myMessage) {
        System.out.println(myMessage);
    }
}
