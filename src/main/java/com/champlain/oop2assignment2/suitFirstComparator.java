package com.champlain.oop2assignment2;

import java.util.Comparator;

public class suitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card pCard1, Card pCard2) {
        if(pCard1.getSuit().ordinal() > pCard2.getSuit().ordinal()){
            return 1;
        }
        else if(pCard1.getSuit().ordinal() < pCard2.getSuit().ordinal()){
            return -1;
        }
        else{
            if(pCard1.getRank().ordinal() > pCard2.getRank().ordinal()){
                return 1;
            }
            else if(pCard1.getRank().ordinal() < pCard2.getRank().ordinal()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
