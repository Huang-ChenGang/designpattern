package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Observer;
import com.hcg.designpattern.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

public class Payment extends AbstractObserver implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void update() {
        this.notifyObserver();
        this.updateDesc = "已完成支付";
    }

    @Override
    public String getNotifyDesc() {
        return "已完成支付，进行库存更新并送货";
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }

    @Override
    public int getObserverNumber() {
        return observerList.size();
    }
}
