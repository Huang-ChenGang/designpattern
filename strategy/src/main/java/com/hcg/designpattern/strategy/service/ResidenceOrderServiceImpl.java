package com.hcg.designpattern.strategy.service;

import org.springframework.stereotype.Service;

@Service("residenceOrderService")
final class ResidenceOrderServiceImpl implements IOrderService {
    @Override
    public String book(String orderType) {
        return "家居订单下单成功";
    }
}
