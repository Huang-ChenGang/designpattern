package com.hcg.designpattern.observer.api;

public interface Subject {

    String getSubjectState();

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

    int getObserverNumber();
}
