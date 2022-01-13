package com.codegym;

public class CardManagement {
    Card[] cards = new Card[0];

    public CardManagement() {

    }
    public CardManagement(Card[] cards) {
        this.cards = cards;
    }



    public Card[] getTheMuons() {
        return cards;
    }

    public void setTheMuons(Card[] cards) {
        this.cards = cards;
    }

    public void displayAllCard() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println((i + 1) + ". " + cards[i]);
        }
    }
    public void addNewCard(int index, Card newCard) {
        Card[] newCards = new Card[cards.length + 1];
        for (int i = 0; i < newCards.length; i++) {
            if (i < index) {
                newCards[i] = cards[i];
            } else if (i == index) {
                newCards[i] = newCard;
            } else {
                newCards[i] = cards[i - 1];
            }
        }
        cards = newCards;
    }
}
