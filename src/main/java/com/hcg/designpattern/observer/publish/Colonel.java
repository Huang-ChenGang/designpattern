package com.hcg.designpattern.observer.publish;

import com.hcg.designpattern.observer.subscribe.IPirate;

import java.util.ArrayList;
import java.util.List;

public class Colonel implements INavy {

    private final List<IPirate> pirateList = new ArrayList<>();

    @Override
    public String getName() {
        return "上校";
    }

    @Override
    public void chase(IPirate pirate) {
        pirateList.add(pirate);
    }

    @Override
    public void ignore(IPirate pirate) {
        pirateList.remove(pirate);
    }

    @Override
    public void action() {
        pirateList.forEach(IPirate::answer);
    }

    @Override
    public int getPirateNumber() {
        return pirateList.size();
    }
}
