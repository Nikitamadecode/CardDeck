package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeckManager {

    public Deck createFullDeck() {
        Set<Card> cards = new HashSet<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardGrade grade : CardGrade.values()) {
                cards.add(new Card(suit, grade));
            }
        }
        return new Deck(cards);

    }

    public Deck createShortDeck() {
        Set<Card> cards = new HashSet<>();
        for (CardSuit suit : CardSuit.values()) {
            cards.add(new Card(suit, CardGrade.ACE));
            cards.add(new Card(suit, CardGrade.KING));
            cards.add(new Card(suit, CardGrade.QUEEN));
            cards.add(new Card(suit, CardGrade.JACK));
            cards.add(new Card(suit, CardGrade.TEN));
            cards.add(new Card(suit, CardGrade.NINE));
            cards.add(new Card(suit, CardGrade.EIGHT));
            cards.add(new Card(suit, CardGrade.SEVEN));
            cards.add(new Card(suit, CardGrade.SIX));
        }
        return new Deck(cards);
    }

    public List<List<Card>> cardDealing (Deck deck, int playersCount, int handSize){

        List<List<Card>> allHands = new ArrayList<>();
        for (int i = 0; i < playersCount; i++){
            List<Card> playerHand = new ArrayList<>();
            for( int j = 0; j < handSize; j++ ){
                playerHand.add(deck.getCard());
            }
            allHands.add(playerHand);
        }
        return allHands;
    }
}
