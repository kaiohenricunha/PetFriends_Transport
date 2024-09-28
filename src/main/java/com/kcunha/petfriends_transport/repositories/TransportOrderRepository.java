package com.kcunha.petfriends_transport.repositories;

import com.kcunha.petfriends_transport.entities.TransportOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for TransportOrder entities.
 */
@Repository
public interface TransportOrderRepository extends JpaRepository<TransportOrder, Long> {
    TransportOrder findByOrderId(String orderId);
}
