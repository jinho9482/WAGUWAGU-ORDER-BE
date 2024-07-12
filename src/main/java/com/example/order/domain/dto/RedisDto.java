package com.example.order.domain.dto;

import java.time.LocalDateTime;

public record RedisDto(

        String orderState,
        LocalDateTime orderCreatedAt,
        String menuName,
        int menuPrice,
        String orderDetail,
        int orderTotalAmount,
        int storeDeliveryFee

) {
}
