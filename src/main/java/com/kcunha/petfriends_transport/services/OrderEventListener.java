package com.kcunha.petfriends_transport.services;

import com.kcunha.petfriends_transport.events.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Service to listen and handle OrderCreatedEvent messages for the PetFriends_Transport microservice.
 */
@Service
public class OrderEventListener {

    @RabbitListener(queues = "order-created-queue")
    public void handleOrderCreated(OrderCreatedEvent event) {
        // Implement your logic to handle the order created event
        System.out.println("Received OrderCreatedEvent: " +
                "Order ID = " + event.getOrderId() +
                ", Product = " + event.getProduct() +
                ", Quantity = " + event.getQuantity());
        
        // More processing can be added here, such as updating transport schedules
    }
}
