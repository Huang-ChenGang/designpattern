package com.hcg.designpattern.strategy.service;

import org.springframework.stereotype.Service;

@Service("clothesOrderService")
final class ClothesOrderServiceImpl implements IOrderService {
    @Override
    public String book(String orderType) {
        return "衣物订单下单成功";
    }
}
