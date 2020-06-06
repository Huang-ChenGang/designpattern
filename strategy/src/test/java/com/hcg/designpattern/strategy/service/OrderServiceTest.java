package com.hcg.designpattern.strategy.service;

import com.hcg.designpattern.StrategyApplicationTests;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceTest extends StrategyApplicationTests {

    @Autowired
    @Qualifier("orderService")
    private IOrderService orderService;

    @Test
    public void testClothesOrder() {
        Assertions.assertEquals("衣物订单下单成功", orderService.book("clothes"));
    }

    @Test
    public void testFoodOrder() {
        Assertions.assertEquals("食品订单下单成功", orderService.book("food"));
    }

    @Test
    public void testResidenceOrder() {
        Assertions.assertEquals("家居订单下单成功", orderService.book("residence"));
    }

    @Test
    public void testTravelOrder() {
        Assertions.assertEquals("出行订单下单成功", orderService.book("travel"));
    }
}
