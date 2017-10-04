public class Main {

    public static void main(String[] args) {

        Carrier carrier = new Carrier(400, 40);
        carrier.addAircraft("F35");
        carrier.addAircraft("F16");
        carrier.addAircraft("F35");
        carrier.addAircraft("F16");

        carrier.fillSquad(carrier.squad);

        for (int i = 0; i < carrier.squad.size(); i++) {
            System.out.println(carrier.squad.get(i).getCurrentAmmo());
        }

        System.out.println(carrier.ammoStore);



    }
}