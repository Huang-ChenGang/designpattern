package com.hcg.designpattern.observer.subscribe;

import lombok.Data;

@Data
public class Zoro implements IPirate {

    private final String navyName;

    private String answer;

    public Zoro(String navyName) {
        this.navyName = navyName;
    }

    @Override
    public void answer() {
        this.answer = navyName.concat("来了，砍飞他！");
    }
}
