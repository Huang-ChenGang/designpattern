package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Observer;
import com.hcg.designpattern.observer.api.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaymentSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    private String subjectState;

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
        this.subjectState = "PAID";
        observerList.forEach(Observer::update);
    }

    @Override
    public int getObserverNumber() {
        return observerList.size();
    }
}
