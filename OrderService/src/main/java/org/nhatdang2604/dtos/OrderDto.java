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

    @Override
    public String toString() {

        String term = """
            OrderDto{
                transId=:transId,
                sku=:skus,
                totalPrice=:totalPrice,
                state= :state
            }
        """;

        term = term.replace(":transId", transId);
        term = term.replace(":skus", skus.toString());
        term = term.replace(":totalPrice", totalPrice.toString());
        term = term.replace(":state", state.toString());

        return term;
    }
}
