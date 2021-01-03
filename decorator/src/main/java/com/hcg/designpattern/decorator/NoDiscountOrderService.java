package com.hcg.designpattern.decorator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("NoDiscount")
public class NoDiscountOrderService implements OrderService {
    @Override
    public BigDecimal quotedPrice() {
        return QUOTE_PRICE;
    }
}
