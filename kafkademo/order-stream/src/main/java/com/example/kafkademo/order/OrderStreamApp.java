package com.example.kafkademo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@SpringBootApplication
public class OrderStreamApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderStreamApp.class, args);
	}

	@Bean
	public KafkaAdmin.NewTopics orderTopics() {
		return new KafkaAdmin.NewTopics(
				TopicBuilder.name("appliance-order")
						.partitions(10)
						.replicas(1)
						.build(),
				TopicBuilder.name("electronic-order")
						.partitions(10)
						.replicas(1)
						.build(),
				TopicBuilder.name("order-user")
						.partitions(10)
						.replicas(1)
						.build(),
				TopicBuilder.name("combined-order")
						.partitions(10)
						.replicas(1)
						.build()
		);
	}
}
