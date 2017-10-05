package BlackJack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("Clubs", "Hearts", "Diamonds", "Spades"));
    ArrayList<String> values = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

    public Deck(int cardNumber) {
        int count = 0;
        int colorIndex = 0;
        int valueIndex = 0;
        for (int i = 0; i <= cardNumber - 1; i++) {
            deck.add(new Card(values.get(valueIndex), colors.get(colorIndex)));
            count++;
            if (count % 4 == 0) {
                valueIndex++;
            }
            colorIndex++;
            if (count % 4 == 0) {
                colorIndex = 0;
            }
        }
    }

    private static void printDeck(Deck pakli) {
        for (int i = 0; i < pakli.deck.size(); i++) {
            System.out.println(pakli.deck.get(i).value + " " + pakli.deck.get(i).color);
            System.out.println();
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card draw() {
        Card drawn = deck.get(0);
        deck.remove(0);
        return drawn;
    }

    @Override
    public String toString() {
        int countHeart = 0;
        int countSpades = 0;
        int countDiamonds = 0;
        int countClubs = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).color == "Hearts") {
                countHeart++;
            } else if (deck.get(i).color == "Clubs") {
                countClubs++;
            } else if (deck.get(i).color == "Spades") {
                countSpades++;
            } else if (deck.get(i).color == "Diamonds") {
                countDiamonds++;
            }
        } return deck.size() + " cards -  " + countClubs + " Clubs, " + countDiamonds + " Diamonds, " + countHeart + " Hearts, " + countSpades + " Spades";
    }

    public static void main(String[] args) {

        Deck pakli = new Deck(52);
        System.out.println(pakli);
        pakli.shuffleDeck();
        Card drawn = pakli.draw();
        System.out.println(drawn);
        System.out.println(pakli);

    }



}
