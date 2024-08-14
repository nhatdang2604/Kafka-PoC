package org.nhatdang2604.dtos;

import java.math.BigDecimal;
import java.util.List;

public record OrderDto(
        List<SkuDto> skus,
        BigDecimal totalPrice
) {
    //do nothing
}
