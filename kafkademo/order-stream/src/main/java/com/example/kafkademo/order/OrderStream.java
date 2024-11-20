package com.example.kafkademo.order;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Component
public class OrderStream {

    private String applianceTopic = "appliance-order";
    private String electronicTopic = "electronic-order";
    private String userTopic = "order-user";
    private String combinedTopic = "combined-order";

    private Serde<ApplianceOrder> applianceSerde = new JsonSerde<>(ApplianceOrder.class);
    private Serde<ElectronicOrder> electronicSerde = new JsonSerde<>(ElectronicOrder.class);
    private Serde<User> userSerde = new JsonSerde<>(User.class);
    private Serde<CombinedOrder> combinedSerde = new JsonSerde<>(CombinedOrder.class);


    @Autowired
    void buildStream(StreamsBuilder builder) {
    }

    @KafkaListener(id = "combined-order-consumer", topics = "combined-order",
            containerFactory = "kafkaListenerContainerFactory")
    public void listenCountEvents(ConsumerRecord<String, CombinedOrder> record) {
        System.out.format("Order id:%s details:%s%n", record.key(), record.value());
    }
}
