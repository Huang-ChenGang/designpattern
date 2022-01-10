package com.hcg.designpattern.strategy.normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderNormalTest {

    private StrategyFactory factory;

    @BeforeEach
    void setUp() {
        factory = new StrategyFactory();
    }

    @Test
    void testClothesOrder() {
        Assertions.assertEquals("衣物订单下单成功", factory.getStrategy("clothes").book());
    }

    @Test
    void testFoodOrder() {
        Assertions.assertEquals("食品订单下单成功", factory.getStrategy("food").book());
    }

    @Test
    void testResidenceOrder() {
        Assertions.assertEquals("家居订单下单成功", factory.getStrategy("residence").book());
    }

    @Test
    void testTravelOrder() {
        Assertions.assertEquals("出行订单下单成功", factory.getStrategy("travel").book());
    }
}
