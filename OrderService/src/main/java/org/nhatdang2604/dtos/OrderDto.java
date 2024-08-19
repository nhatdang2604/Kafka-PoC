package org.nhatdang2604.dtos;

import java.math.BigDecimal;
import java.util.List;

public record OrderDto(
        String transId,
        List<SkuDto> skus,
        BigDecimal totalPrice,
        OrderDto.State state
) {
    public enum State {
        PENDING,
        PAYMENT_AWAITING,
        FAILED,
    }
}
