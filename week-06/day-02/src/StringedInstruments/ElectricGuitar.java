package StringedInstruments;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super(6);
        setName("Electric Guitar");
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Electric Guitar");
    }

    @Override
    public String sound() {
        return "twangs";
    }

    @Override
    public void play() {
        System.out.println(getName() + " a " + getNumberOfStrings() + "-stringed instrument that " + sound());
    }
}
