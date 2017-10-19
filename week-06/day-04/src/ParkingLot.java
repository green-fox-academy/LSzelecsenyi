import java.util.ArrayList;

public class ParkingLot {

    public static void main(String[] args) {

        Truck teheroto = new Truck();
        ArrayList<Truck> trucks = teheroto.generateTruck(256);
        teheroto.sumColor(trucks);
        System.out.println();
        teheroto.sumType(trucks);
    }


}
