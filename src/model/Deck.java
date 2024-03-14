package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Deck {
    private Set<Card> cards = new HashSet<>();

    public Deck(Set<Card> cards) {
        this.cards = cards;
    }

    public Card getCard() {
        Random random = new Random();
        Iterator<Card> iterator = cards.iterator();
        int cardNumber = random.nextInt(cards.size());

        Card card = iterator.next();
        for (int i = 0; i < cardNumber; i++) {

            card = iterator.next();
        }
        cards.remove(card);
        return card;

    }

    public int getDeckSize() {
        return cards.size();
    }
}
