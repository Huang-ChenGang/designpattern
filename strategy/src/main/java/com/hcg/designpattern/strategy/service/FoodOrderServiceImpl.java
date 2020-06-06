package com.hcg.designpattern.strategy.service;

import org.springframework.stereotype.Service;

@Service("foodOrderService")
final class FoodOrderServiceImpl implements IOrderService {
    @Override
    public String book(String orderType) {
        return "食品订单下单成功";
    }
}
