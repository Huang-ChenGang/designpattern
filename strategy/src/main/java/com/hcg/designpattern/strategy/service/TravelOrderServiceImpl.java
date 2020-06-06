package com.hcg.designpattern.strategy.service;

import org.springframework.stereotype.Service;

@Service("travelOrderService")
final class TravelOrderServiceImpl implements IOrderService {
    @Override
    public String book(String orderType) {
        return "出行订单下单成功";
    }
}
