package BlackJack;

public class Card {
    String color;
    String value;

    public Card(String value, String color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.value + "  " + this.color;
    }
}

