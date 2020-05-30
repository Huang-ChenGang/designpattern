package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Subject;

public class PaymentObserver extends AbstractObserver {

    public PaymentObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        if ("ORDERED".equals(this.subject.getSubjectState())) {
            this.observerState = "PAID";
        }
    }
}
