package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Observer;
import com.hcg.designpattern.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public String getNotifyDesc() {
        return "订单已生成";
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
