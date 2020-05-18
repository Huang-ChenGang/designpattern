package com.hcg.designpattern.observer.impl;

public class Stock extends AbstractObserver {

    @Override
    public void update() {
        this.updateDesc = "库存已更新";
    }
}
