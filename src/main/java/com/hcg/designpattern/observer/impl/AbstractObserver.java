package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Observer;
import com.hcg.designpattern.observer.api.Subject;
import lombok.Data;

@Data
abstract class AbstractObserver implements Observer {

    protected final Subject subject;

    protected String observerState;

    public AbstractObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
}
