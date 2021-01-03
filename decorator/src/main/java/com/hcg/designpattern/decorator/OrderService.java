package com.hcg.designpattern.decorator;

import java.math.BigDecimal;

public interface OrderService {
    BigDecimal QUOTE_PRICE = BigDecimal.valueOf(100);

    BigDecimal quotedPrice();
}
