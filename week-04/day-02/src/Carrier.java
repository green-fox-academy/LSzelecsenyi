import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Carrier {
    int hp;
    int ammoStore;
    ArrayList<Aircraft> squad;

    public Carrier(int hp, int ammoStore) {
        this.hp = hp;
        this.ammoStore = ammoStore;
        this.squad = new ArrayList<Aircraft>();
    }

    public void addAircraft(String aircraftToAdd) {
        if (aircraftToAdd.equals("F16")) {
            squad.add(new F16());
        } else if (aircraftToAdd.equals("F35")) {
            squad.add(new F35());
        }
    }

//    It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
//    If there is not enough ammo than it should start to fill the F35 types first
//    If there is no ammo when this method is called it should throw an exception

//doesn't work yet
    public int fillSquad(ArrayList<Aircraft> squad) {
        int countF16 = 0;
        int countF35 = 0;
        for (int i = 0; i < squad.size(); i++) {
            squad.get(i).refill(this.ammoStore);
            this.ammoStore = squad.get(i).refill(ammoStore);
        } return ammoStore;
    }



}
