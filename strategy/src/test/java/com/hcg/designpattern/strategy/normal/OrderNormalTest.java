package com.hcg.designpattern.strategy.normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderNormalTest {

    private StrategyContext context;

    @Test
    public void testClothesOrder() {
        context = new StrategyContext("clothes");
        Assertions.assertEquals("衣物订单下单成功", context.book());
    }

    @Test
    public void testFoodOrder() {
        context = new StrategyContext("food");
        Assertions.assertEquals("食品订单下单成功", context.book());
    }

    @Test
    public void testResidenceOrder() {
        context = new StrategyContext("residence");
        Assertions.assertEquals("家居订单下单成功", context.book());
    }

    @Test
    public void testTravelOrder() {
        context = new StrategyContext("travel");
        Assertions.assertEquals("出行订单下单成功", context.book());
    }
}
