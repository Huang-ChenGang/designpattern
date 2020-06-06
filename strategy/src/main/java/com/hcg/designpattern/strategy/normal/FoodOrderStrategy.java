package com.hcg.designpattern.strategy.normal;

public class FoodOrderStrategy extends AbstractStrategy {
    @Override
    protected String getOrderType() {
        return "食品订单";
    }
}
