package com.champlain.oop2assignment2;

public class Card {
    private final Suit aSuit;

    private final Rank aRank;

    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public Rank getRank() {
        return this.aRank;
    }

    public Suit getSuit() {
        return this.aSuit;
    }

    @Override
    public boolean equals(Object card) {
        if (this == card) {
            return true;
        }

        if (card == null || getClass() != card.getClass()) {
            return false;
        }

        Card otherCard = (Card) card;
        return aRank == otherCard.aRank && aSuit.equals(otherCard.aSuit);
    }

    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }
}
