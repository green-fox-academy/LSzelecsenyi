package StringedInstruments;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super(4);
        setName("Bass Guitar");
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Bass Guitar");
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(getName() + " a " + getNumberOfStrings() + "-stringed instrument that " + sound());
    }
}