package com.hcg.designpattern.strategy;

public class ResidenceOrderStrategy extends AbstractStrategy {
    @Override
    protected String getOrderType() {
        return "家居订单";
    }
}
