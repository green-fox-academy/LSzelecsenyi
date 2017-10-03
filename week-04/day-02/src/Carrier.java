import java.util.ArrayList;

public class Carrier {
    int hp;
    int ammoStore;
    ArrayList<Aircraft> squad;

    public Carrier(int hp, int ammoStore) {
        this.hp = hp;
        this.ammoStore = ammoStore;
        this.squad = new ArrayList<Aircraft>();
    }

    public addAircraft(String aircraftToAdd) {
        if (aircraftToAdd.equals("F16")) {
            squad.add(new F16());
        } else if (aircraftToAdd.equals("F35")) {
            squad.add(new F35());
        }
    }



}
