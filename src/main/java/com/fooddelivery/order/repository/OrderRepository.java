package com.fooddelivery.order.repository;

import com.fooddelivery.order.model.Order;
import com.fooddelivery.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
