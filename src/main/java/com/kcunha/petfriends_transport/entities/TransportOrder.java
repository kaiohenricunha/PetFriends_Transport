package com.kcunha.petfriends_transport.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Entity representing a transport order in the PetFriends_Transport microservice.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransportOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private String status;

    public TransportOrder(String orderId, String deliveryAddress, LocalDate deliveryDate, String status) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }
}
