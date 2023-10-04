package com.champlain.oop2assignment2;

import java.util.List;

public class NumberOfAceStrategy implements ScoringStrategy{

    private static NumberOfAceStrategy aInstance = null;
    private NumberOfAceStrategy(){}
    public static NumberOfAceStrategy getInstance(){
        if(aInstance == null) aInstance = new NumberOfAceStrategy();
        return aInstance;
    }


    @Override
    public int calculateScore(List<Card> pcards) {
        int numberOfAces = 0;
        for(Card c : pcards){
            if(c.getRank() == Rank.ACE) numberOfAces++;
        }
        return numberOfAces;
    }
}
