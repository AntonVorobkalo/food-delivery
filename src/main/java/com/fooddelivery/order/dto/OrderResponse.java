package com.fooddelivery.order.dto;

import com.fooddelivery.order.model.OrderStatus;

import java.time.OffsetDateTime;

public record OrderResponse(
        Long id,
        Long userId,
        OrderStatus status,
        OffsetDateTime createdAt
) {
}
