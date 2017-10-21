import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Truck {


    public enum TruckType {IFA, ZIL, BARKAS, KAMAZ, ZUK, GAZ};
    public enum TruckColor {RUSTY, WORN, POTTYBLUE, YELLOWISH, MUDDY};
    TruckType type;
    TruckColor color;
    ArrayList<Truck> trucks;
    HashMap mostCommonTruckMap;

    public Truck() {
        type = (TruckType) randomAttribute("type");
        color = (TruckColor) randomAttribute("color");
        trucks = new ArrayList<>();
    }

    public Enum randomAttribute(String attribute) {
        if ( attribute == "color") {
            Enum color = TruckColor.values()[(int) (Math.random() * TruckColor.values().length)];
            return color;
        } else {
            Enum type = TruckType.values()[(int) (Math.random() * TruckType.values().length)];
            return type;
        }
    }

    public ArrayList<Truck> generateTruck(int howMany) {
        this.trucks = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }

    public Enum getAttribute(String attribute) {
        if (attribute == "color") {
            return color;
        } else if (attribute == "type") {
            return type;
        } else return null;
    }

    public void createMostCommonTruckMap(ArrayList<Truck> trucks) {
        this.mostCommonTruckMap = new HashMap<Truck, Integer>();
        for (Truck truck : trucks) {
            if (mostCommonTruckMap.containsKey(truck)) {
                int count = (int) mostCommonTruckMap.get(truck);
                mostCommonTruckMap.put(truck, count + 1);
            } else {
                mostCommonTruckMap.put(truck, 1);
            }
        }
    }

    public void getMostCommonTruck(Map<Truck, Integer> mostCommonTruckMap) {
        Map.Entry<Truck, Integer> maxEntry = null;
        for(Map.Entry<Truck, Integer> entry : mostCommonTruckMap.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }
        System.out.println("MOST COMMON-COLOR COMBINATION IS: " + maxEntry.getKey().color + "-" + maxEntry.getKey().type);
    }

    public void printMap(Map<Enum, Integer> truckTypeMap) {
        System.out.println("TRUCK TYPES AND THEIR OCCURRENCES ARE");
        for (Map.Entry<Enum, Integer> entry : truckTypeMap.entrySet()) {
            Enum key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " TRUCKS: " + value + " PIECE(S)");
        }
        System.out.println();
    }

    public void sumAttribute (ArrayList<Truck> trucks, String attribute) {
        Map<Enum, Integer> attributeMap = new HashMap<>();
        for (Truck truck : trucks) {
            if (attributeMap.containsKey(truck.getAttribute(attribute))) {
                int count = attributeMap.get(truck.getAttribute(attribute));
                attributeMap.put(truck.getAttribute(attribute), count + 1);
            } else {
                attributeMap.put(truck.getAttribute(attribute), 1);
            }
        }
        printMap(attributeMap);
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
