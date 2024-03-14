package model;

import java.util.Objects;

public class Card {
    private CardSuit cardSuit;
    private CardGrade cardGrade;

    @Override
    public String toString() {
        return this.cardGrade + this.cardSuit.getSymbol();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardSuit == card.cardSuit && cardGrade == card.cardGrade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardSuit, cardGrade);
    }

    public Card(CardSuit cardSuit, CardGrade cardGrade) {
        this.cardSuit = cardSuit;
        this.cardGrade = cardGrade;
    }

    public CardGrade getCardGrade() {
        return cardGrade;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setCardGrade(CardGrade cardGrade) {
        this.cardGrade = cardGrade;
    }
}
