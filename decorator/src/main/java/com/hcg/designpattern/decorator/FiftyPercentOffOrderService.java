package com.hcg.designpattern.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("FiftyPercentOff")
public class FiftyPercentOffOrderService implements OrderService {
    private final OrderService orderService;

    public FiftyPercentOffOrderService(@Qualifier("NoDiscount") OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public BigDecimal quotedPrice() {
        return orderService.quotedPrice().multiply(BigDecimal.valueOf(0.5));
    }
}
