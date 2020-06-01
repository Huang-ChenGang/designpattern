package com.hcg.designpattern.strategy;

public class StrategyContext {

    private AbstractStrategy orderStrategy;

    public StrategyContext(String orderType) {
        switch (orderType) {
            case "clothes":
                orderStrategy = new ClothesOrderStrategy();
                break;
            case "food":
                orderStrategy = new FoodOrderStrategy();
                break;
            case "residence":
                orderStrategy = new ResidenceOrderStrategy();
                break;
            case "travel":
                orderStrategy = new TravelOrderStrategy();
                break;
            default:
                break;
        }
    }

    public String book() {
        return orderStrategy.book();
    }
}
