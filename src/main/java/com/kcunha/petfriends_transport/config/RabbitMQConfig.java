package com.kcunha.petfriends_transport.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for RabbitMQ in the PetFriends_Transport microservice.
 */
@Configuration
public class RabbitMQConfig {

    public static final String ORDER_CREATED_QUEUE = "order-created-queue";

    @Bean
    public Queue orderCreatedQueue() {
        return new Queue(ORDER_CREATED_QUEUE, true); // Durable queue
    }
}
