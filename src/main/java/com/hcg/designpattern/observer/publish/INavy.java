package com.hcg.designpattern.observer.publish;

import com.hcg.designpattern.observer.subscribe.IPirate;

public interface INavy {

    String getName();

    void chase(IPirate pirate);

    void ignore(IPirate pirate);

    void action();

    int getPirateNumber();
}
