package aircraft;

public class Main {

    public static void main(String[] args) {

        Carrier carrier = new Carrier(400, 40);
        carrier.addAircraft("aircraft.F35");
        carrier.addAircraft("aircraft.F16");
        carrier.addAircraft("aircraft.F35");
        carrier.addAircraft("aircraft.F16");

        carrier.fillSquad(carrier.squad);

        for (int i = 0; i < carrier.squad.size(); i++) {
            System.out.println(carrier.squad.get(i).getCurrentAmmo());
        }

        System.out.println(carrier.ammoStore);

        F35 f35 = new F35();
        System.out.println(f35.refill(30));
        System.out.println(f35.currentAmmo);




    }
}