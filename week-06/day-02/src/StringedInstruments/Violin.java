package StringedInstruments;

public class Violin extends StringedInstrument {

    public Violin() {
        super(6);
        setName("Violin");
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        setName("Violin");
    }

    @Override
    public String sound() {
        return "screeches";
    }

    @Override
    public void play() {
        System.out.println(getName() + " a " + getNumberOfStrings() + "-stringed instrument that " + sound());
    }
}
