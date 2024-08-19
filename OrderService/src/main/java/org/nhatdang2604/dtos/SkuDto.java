package org.nhatdang2604.dtos;

import java.math.BigDecimal;

public record SkuDto (
        String sku,
        Long quantity,
        BigDecimal price
) {
    //do nothing
}
