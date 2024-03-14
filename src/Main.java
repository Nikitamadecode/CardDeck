import model.Card;
import model.CardSuit;
import model.Deck;
import model.DeckManager;

import java.util.List;
import java.util.Scanner;

import static model.CardSuit.SPADES;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DeckManager deckManager = new DeckManager();
        System.out.println("Выберите размер колоды  52/36");
        Deck deck;
        if(scan.nextLine().equals("52")){
            deck  = deckManager.createFullDeck();
        }else{
             deck = deckManager.createShortDeck();
        }
        System.out.println("Введите количество игроков");
        int playersCount = scan.nextInt();
        System.out.println("Введите размер руки");
        int handSize = scan.nextInt();

        List<List<Card>> cardDealing = deckManager.cardDealing(deck, playersCount, handSize);

        for (List<Card> hand : cardDealing) {
            System.out.println("********");
            for (Card card : hand) {
                System.out.print(card.toString() + " ");
            }
            System.out.println();
        }
        System.out.println("Остаток в колоде - " + deck.getDeckSize());
        System.out.println();
    }
}