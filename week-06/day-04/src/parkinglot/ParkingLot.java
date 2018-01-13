import java.util.ArrayList;

public class ParkingLot {

    public static void main(String[] args) {

        Truck teheroto = new Truck();
        ArrayList<Truck> trucks = teheroto.generateTruck(256);
        teheroto.sumAttribute(trucks, "color");
        teheroto.sumAttribute(trucks, "type");
        teheroto.createMostCommonTruckMap(trucks);
        teheroto.getMostCommonTruck(teheroto.mostCommonTruckMap);
    }
}
