package com.hcg.designpattern.strategy;

public class ClothesOrderStrategy extends AbstractStrategy {
    @Override
    protected String getOrderType() {
        return "衣物订单";
    }
}
