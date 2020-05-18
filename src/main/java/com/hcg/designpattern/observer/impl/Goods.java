package com.hcg.designpattern.observer.impl;

public class Goods extends AbstractObserver {

    @Override
    public void update() {
        this.updateDesc = "商品已发出";
    }
}
