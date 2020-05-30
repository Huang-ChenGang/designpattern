package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Subject;

public class Stock extends AbstractObserver {

    public Stock(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        if ("PAID".equals(this.subject.getSubjectState())) {
            this.observerState = "UPDATE";
        }
    }
}
