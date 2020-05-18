package com.hcg.designpattern.observer.api;

public interface Subject {

    String getNotifyDesc();

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

    int getObserverNumber();
}
