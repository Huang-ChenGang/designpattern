package com.hcg.designpattern.observer.subscribe;

import lombok.Data;

@Data
public class Luffy implements IPirate {

    private final String navyName;

    private String answer;

    public Luffy(String navyName) {
        this.navyName = navyName;
    }

    @Override
    public void answer() {
        this.answer = navyName.concat("来了，打飞他！");
    }
}
