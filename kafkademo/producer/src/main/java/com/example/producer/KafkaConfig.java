package com.example.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic11() {
        return TopicBuilder.name("topic11")
                .partitions(12)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topic12() {
        return TopicBuilder.name("topic12")
                .partitions(12)
                .replicas(1)
                .build();
    }

    @Bean
    public ProducerFactory<String, String> producerFactory1() {
        return new DefaultKafkaProducerFactory<>(producerConfigs1());
    }

    @Bean
    public ProducerFactory<String, Object> producerFactory2() {
        return new DefaultKafkaProducerFactory<>(producerConfigs2());
    }

    @Bean
    public Map<String, Object> producerConfigs1() {
        HashMap<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        return config;
    }

    @Bean
    public Map<String, Object> producerConfigs2() {
        HashMap<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return config;
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate1 () {
        return new KafkaTemplate<>(producerFactory1());
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate2 () {
        return new KafkaTemplate<>(producerFactory2());
    }

}
