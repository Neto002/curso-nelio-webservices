package com.neto.cursoneliowebservices.repositories;

import com.neto.cursoneliowebservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
