package JP;

import java.io.*;
import java.util.*;

class Card {
    private static final int CLUBS = 1;
    private static final int DIAMONDS = 2;
    private static final int HEARTS = 3;
    private static final int SPADES = 4;
    private static final int ACE = 1;
    private static final int KING = 13;
    private static final int QUEEN = 12;
    private static final int JACK = 11;
    public final int suit, rank;

    Card(int suit, int rank) throws UndefinedCardException {
        if (suit > 5 || suit < 1) {
            throw new UndefinedCardException("Suit");
        }
        if (rank > 13 || rank < 1) {
            throw new UndefinedCardException("Rank");
        }
        this.suit = suit;
        this.rank = rank;
    }

}

class DeckOfCards {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> playcards = new ArrayList<Card>();

    void createDeck() throws UndefinedCardException {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards.add(new Card(i, j));
            }
        }
    }

    void printDeck() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(toString(cards.get(i).suit, cards.get(i).rank));
        }
    }

    String toString(int suit, int rank) {
        String su = " ";
        String val = " ";
        if (suit == 1) {
            su = "Clubs";
        } else if (suit == 2) {
            su = "Diamonds";
        } else if (suit == 3) {
            su = "Hearts";
        } else {
            su = "Spades";
        }
        if (rank == 1) {
            val = "Ace";
        } else if (rank == 11) {
            val = "Jack";
        } else if (rank == 12) {
            val = "Queen";
        } else if (rank == 13) {
            val = "King";
        } else {
            val = Integer.toString(rank);
        }
        return val + " of " + su;
    }

    void printCard(int suit, int rank) {
        System.out.println(toString(suit, rank));
    }

    void sameCard(Card c1, Card c2) {
        if (c1.suit == c2.suit && c1.rank == c2.rank) {
            System.out.println("Same cards.");
        } else {
            System.out.println("Different cards.");
        }
    }

    void compareCards(Card c1, Card c2) {
        int count;
        if (c1.suit > c2.suit) {
            count = 1;
        } else if (c1.suit < c2.suit) {
            count = -1;
        } else {
            if (c1.rank > c2.rank) {
                count = 1;
            } else if (c1.rank < c2.rank) {
                count = -1;
            } else {
                count = 0;
            }
        }
        if (count < 0) {
            System.out.println("Card 1 is greater than Card 2.");
        } else if (count > 0) {
            System.out.println("Card 1 is smaller than Card 2.");
        } else {
            System.out.println("Card1 and Card2 are equal.");
        }
    }

    void findCard(Card c) {
        int flag = 0;
        for (int i = 0; i < cards.size(); i++) {
            if (c.suit == cards.get(i).suit && c.rank == cards.get(i).rank) {
                System.out.println("Card is found.");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Card is not found.");
        }
    }

    public void dealDeck() throws UndefinedCardException {
        Collections.shuffle(cards);
        playcards.clear();
        for (int i = 0; i <= 4; i++) {
            playcards.add(this.cards.get(i));
            this.cards.remove(playcards.get(i));
        }
        System.out.println("Your deal of deck is:");
        for (int i = 0; i < playcards.size(); i++) {
            printCard(playcards.get(i).suit, playcards.get(i).rank);
        }
    }
}

class UndefinedCardException extends Exception // Custom Excpetion when we get an Invalid class or Card
{
    UndefinedCardException(String s) {
        super("Invalid " + s);
    }
}

class Assignmentt4 {
    public static void main(String[] args) throws UndefinedCardException {
        Scanner sc = new Scanner(System.in);
        DeckOfCards doc = new DeckOfCards();
        char ch = 'y';
        while (ch == 'y') {
            System.out.println(
                    "Enter the option:\n1)Create Deck\n2)Display Card\n3)Print deck\n4)Same Card\n5)Compare cards\n6)Search Card\n7)Deal Deck");
            int f = sc.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Create deck:");
                    System.out.println("Created.");
                    doc.createDeck();
                    break;
                case 2:
                    System.out.println("Display card:");
                    System.out.println("Enter the suit and rank of the card to be displayed:");
                    int suit2 = sc.nextInt();
                    int rank2 = sc.nextInt();
                    doc.printCard(suit2, rank2);
                    break;
                case 3:
                    System.out.println("Print deck:");
                    doc.printDeck();
                    break;
                case 4:
                    System.out.println("Same card check:");
                    System.out.println("Enter suit and rank of first card:");
                    int suit3 = sc.nextInt();
                    int rank3 = sc.nextInt();
                    System.out.println("Enter suit and rank of second card:");
                    int suit4 = sc.nextInt();
                    int rank4 = sc.nextInt();
                    Card c1 = new Card(suit3, rank3);
                    Card c2 = new Card(suit4, rank4);
                    doc.sameCard(c1, c2);
                    break;
                case 5:
                    System.out.println("Compare cards:");
                    System.out.println("Enter suit and rank of first card:");
                    int suit5 = sc.nextInt();
                    int rank5 = sc.nextInt();
                    System.out.println("Enter suit and rank of second card:");
                    int suit6 = sc.nextInt();
                    int rank6 = sc.nextInt();
                    Card c3 = new Card(suit5, rank5);
                    Card c4 = new Card(suit6, rank6);
                    doc.compareCards(c3, c4);
                    break;
                case 6:
                    System.out.println("Search cards:");
                    System.out.println("Enter suit and rank of the card to be searched:");
                    int suit7 = sc.nextInt();
                    int rank7 = sc.nextInt();
                    Card c5 = new Card(suit7, rank7);
                    doc.findCard(c5);
                    break;
                case 7:
                    System.out.println("Deal deck:");
                    doc.dealDeck();
                    break;
                default:
                    System.out.println("Enter the correct option.");
            }
            System.out.println("Do you want to continue?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
    }
}
