package com.hcg.designpattern.strategy.normal;

public class TravelOrderStrategy extends AbstractStrategy {
    @Override
    protected String getOrderType() {
        return "出行订单";
    }
}
