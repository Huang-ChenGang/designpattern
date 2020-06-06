package com.hcg.designpattern.strategy.normal;

abstract class AbstractStrategy {

    public String book() {
        return getOrderType() + "下单成功";
    }

    protected abstract String getOrderType();
}
