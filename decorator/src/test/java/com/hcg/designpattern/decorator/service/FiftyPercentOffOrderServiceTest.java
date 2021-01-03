package com.hcg.designpattern.decorator.service;

import com.hcg.designpattern.decorator.DecoratorApplicationTests;
import com.hcg.designpattern.decorator.OrderService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FiftyPercentOffOrderServiceTest extends DecoratorApplicationTests {

    @Autowired
    @Qualifier("FiftyPercentOff")
    private OrderService orderService;

    @Test
    public void testQuotedPrice() {
        Assertions.assertEquals(BigDecimal.valueOf(50).intValue(), orderService.quotedPrice().intValue());
    }
}
