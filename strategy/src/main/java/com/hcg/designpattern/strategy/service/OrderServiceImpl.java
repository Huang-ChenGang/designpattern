package com.hcg.designpattern.strategy.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    private final IOrderService clothesOrderService;
    private final IOrderService foodOrderService;
    private final IOrderService residenceOrderService;
    private final IOrderService travelOrderService;

    public OrderServiceImpl(@Qualifier("clothesOrderService") IOrderService clothesOrderService,
                            @Qualifier("foodOrderService") IOrderService foodOrderService,
                            @Qualifier("residenceOrderService") IOrderService residenceOrderService,
                            @Qualifier("travelOrderService") IOrderService travelOrderService) {
        this.clothesOrderService = clothesOrderService;
        this.foodOrderService = foodOrderService;
        this.residenceOrderService = residenceOrderService;
        this.travelOrderService = travelOrderService;
    }

    @Override
    public String book(String orderType) {
        String bookResult = null;

        switch (orderType) {
            case "clothes":
                bookResult = clothesOrderService.book(orderType);
                break;
            case "food":
                bookResult = foodOrderService.book(orderType);
                break;
            case "residence":
                bookResult = residenceOrderService.book(orderType);
                break;
            case "travel":
                bookResult = travelOrderService.book(orderType);
                break;
            default:
                break;
        }

        return bookResult;
    }
}
