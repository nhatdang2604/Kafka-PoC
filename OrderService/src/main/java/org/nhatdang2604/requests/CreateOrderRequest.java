package org.nhatdang2604.requests;

import org.nhatdang2604.dtos.OrderDto;
import org.nhatdang2604.dtos.SkuDto;

import java.math.BigDecimal;
import java.util.List;

public record CreateOrderRequest(
        List<SkuDto> skus,
        BigDecimal totalPrice
) {

    public OrderDto toDto(String transId) {
        return new OrderDto(
            transId,
            skus,
            totalPrice,
            OrderDto.State.PENDING
        );
    }
}
