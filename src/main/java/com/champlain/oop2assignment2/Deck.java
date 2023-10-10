package com.champlain.oop2assignment2;

import java.util.*;

public class Deck extends CardCollection implements CardSource {
    private final List<Card> aCards = new ArrayList<Card>();
    private boolean isRankFirst; //*1

    public Deck() {
        isRankFirst = false; //Why do I need to do this, couldn't I just initialize it with false here(*1)

        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    public void setRankFirst(boolean rankFirst){
        this.isRankFirst = rankFirst;
    }

    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    public void sortDeck(){
        if(isRankFirst){
            rankFirstComparator rankFirstComparator = new rankFirstComparator();

            Collections.sort(aCards, rankFirstComparator);
        }else{
            //do Nothing for now
        }
    }
}
