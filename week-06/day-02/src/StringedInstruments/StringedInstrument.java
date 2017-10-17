package StringedInstruments;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;


    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
