package com.hcg.designpattern.strategy.normal;

public class StrategyFactory {

    public AbstractStrategy getStrategy(String orderType) {
        switch (orderType) {
            case "clothes":
                return new ClothesOrderStrategy();
            case "food":
                return new FoodOrderStrategy();
            case "residence":
                return new ResidenceOrderStrategy();
            case "travel":
                return new TravelOrderStrategy();
            default:
                return null;
        }
    }

}
