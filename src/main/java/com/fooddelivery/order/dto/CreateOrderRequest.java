package com.fooddelivery.order.dto;

import com.fooddelivery.order.model.OrderStatus;
import jakarta.validation.constraints.NotNull;

public record CreateOrderRequest(
        @NotNull(message = "User ID is required")
        Long userId
) {
}
