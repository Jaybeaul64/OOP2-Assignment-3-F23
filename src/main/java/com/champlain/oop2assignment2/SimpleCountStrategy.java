package com.champlain.oop2assignment2;

import java.util.List;

public class SimpleCountStrategy implements ScoringStrategy {

    private SimpleCountStrategy(){}
    private static SimpleCountStrategy aInstance = null;
    public static SimpleCountStrategy getInstance(){
        if(aInstance == null){
            aInstance = new SimpleCountStrategy();
        }
        return aInstance;
    }

    @Override
    public int calculateScore(List<Card> pcards) {
        return pcards.size();
    }
}
