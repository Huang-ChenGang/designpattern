package com.hcg.designpattern.strategy;

public class FoodOrderStrategy extends AbstractStrategy {
    @Override
    protected String getOrderType() {
        return "食品订单";
    }
}
