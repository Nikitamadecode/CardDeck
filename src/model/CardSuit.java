package model;

public enum CardSuit {
    HEARTS("♥"), DIAMONDS("♦"), SPADES("♠"), CLUBS("♣");

    private String symbol;

    CardSuit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }



}
