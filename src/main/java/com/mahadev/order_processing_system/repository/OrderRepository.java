package com.mahadev.order_processing_system.repository;

import com.mahadev.order_processing_system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
