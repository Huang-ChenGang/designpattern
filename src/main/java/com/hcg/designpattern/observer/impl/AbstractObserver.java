package com.hcg.designpattern.observer.impl;

import com.hcg.designpattern.observer.api.Observer;
import lombok.Data;

@Data
abstract class AbstractObserver implements Observer {
    protected String updateDesc;
}
