import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Truck {

    public enum TruckType {IFA, ZIL, BARKAS, KAMAZ, ZUK, GAZ};
    public enum TruckColor {RUSTY, WORN, IVORY, POTTYBLUE, YELLOWISH};
    TruckType type;
    TruckColor color;
    String name;

    public Truck() {
        type = randomType();
        color = randomColor();
        name = getColor() + " " + getColor();
    }

    public TruckType randomType() {
        TruckType type = TruckType.values()[(int) (Math.random() * TruckType.values().length)];
        return type;
    }

    public TruckColor randomColor() {
        TruckColor color = TruckColor.values()[(int) (Math.random() * TruckColor.values().length)];
        return color;
    }

    public TruckType getType() {
        return type;
    }

    public TruckColor getColor() {
        return color;
    }

    public ArrayList<Truck> generateTruck(int howMany) {
        ArrayList<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }

    public void sumColor (ArrayList<Truck> trucks) {
        Map<TruckColor, Integer> truckColorMap = new HashMap<>();
        for (Truck truck : trucks) {
            if (truckColorMap.containsKey(truck.getColor())) {
                int count = truckColorMap.get(truck.getColor());
                truckColorMap.put(truck.getColor(), count + 1);
            } else {
                truckColorMap.put(truck.getColor(), 1);
            }
        }
        printColorMap(truckColorMap);
    }

    public void sumType (ArrayList<Truck> trucks) {
        Map<TruckType, Integer> truckTypeMap = new HashMap<>();
        for (Truck truck : trucks) {
            if (truckTypeMap.containsKey(truck.getType())) {
                int count = truckTypeMap.get(truck.getType());
                truckTypeMap.put(truck.getType(), count + 1);
            } else {
                truckTypeMap.put(truck.getType(), 1);
            }
        }
        printTypeMap(truckTypeMap);
    }

    public void getMostCommonTruck(ArrayList<Truck> trucks) {
        Map<Truck, Integer> mostCommonTruckMap = new HashMap<>();
        for (Truck truck : trucks) {
            if (mostCommonTruckMap.containsKey(truck)) {
                int count = mostCommonTruckMap.get(truck);
                mostCommonTruckMap.put(truck, count + 1);
            } else {
                mostCommonTruckMap.put(truck, 1);
            }
        }
        Map.Entry<Truck, Integer> maxEntry = null;
        for(Map.Entry<Truck, Integer> entry : mostCommonTruckMap.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }
        System.out.println("MOST COMMON-COLOR COMBINATION IS: " + maxEntry.getKey().color + "-" + maxEntry.getKey().type);;
    }


    public void printColorMap(Map<TruckColor, Integer> truckColorMap) {
            System.out.println("TRUCK COLORS AND THEIR OCCURRENCES ARE");
        for (Map.Entry<TruckColor, Integer> entry : truckColorMap.entrySet()) {
            TruckColor key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " TRUCKS: " + value + " PIECE(S)");
        }
    }

    public void printTypeMap(Map<TruckType, Integer> truckTypeMap) {
            System.out.println("TRUCK TYPES AND THEIR OCCURRENCES ARE");
        for (Map.Entry<TruckType, Integer> entry : truckTypeMap.entrySet()) {
            TruckType key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " TRUCKS: " + value + " PIECE(S)");
        }
    }


    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Truck))return false;
        Truck truck = (Truck)other;
        if (this.color == ((Truck) other).color && this.type == ((Truck) other).type) return true;
        return false;
    }

}
