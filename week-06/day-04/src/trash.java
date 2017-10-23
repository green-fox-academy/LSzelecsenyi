////import java.util.ArrayList;
////import java.util.HashMap;
////import java.util.Map;
////
////public class trash {
////
////
////    public Truck.TruckType randomType() {
////        Truck.TruckType type = Truck.TruckType.values()[(int) (Math.random() * Truck.TruckType.values().length)];
////        return type;
////    }
////
////    public Truck.TruckColor randomColor() {
////        Truck.TruckColor color = Truck.TruckColor.values()[(int) (Math.random() * Truck.TruckColor.values().length)];
////        return color;
////    }
////
//////    public Truck.TruckType getType() {
//////
//////        return type;
//////    }
//////
//////    public Truck.TruckColor getColor() {
//////
//////        return color;
//////    }
////
////
//    public void sumColor (ArrayList<Truck> trucks) {
//        Map<TruckColor, Integer> truckColorMap = new HashMap<>();
//        for (Truck truck : trucks) {
//            if (truckColorMap.containsKey(truck.getColor())) {
//                int count = truckColorMap.get(truck.getColor());
//                truckColorMap.put(truck.getColor(), count + 1);
//            } else {
//                truckColorMap.put(truck.getColor(), 1);
//            }
//        }
//        printColorMap(truckColorMap);
//    }
//
//    public void sumType (ArrayList<Truck> trucks) {
//        Map<TruckType, Integer> truckTypeMap = new HashMap<>();
//        for (Truck truck : trucks) {
//            if (truckTypeMap.containsKey(truck.getType())) {
//                int count = truckTypeMap.get(truck.getType());
//                truckTypeMap.put(truck.getType(), count + 1);
//            } else {
//                truckTypeMap.put(truck.getType(), 1);
//            }
//        }
//        printTypeMap(truckTypeMap);
//    }
//
////
////    public void printColorMap(Map<Enum, Integer> truckColorMap) {
////        System.out.println("TRUCK COLORS AND THEIR OCCURRENCES ARE");
////        for (Map.Entry<Enum, Integer> entry : truckColorMap.entrySet()) {
////            Enum key = entry.getKey();
////            Integer value = entry.getValue();
////            System.out.println(key + " TRUCKS: " + value + " PIECE(S)");
////        }
////    }
////
////    public void printTypeMap(Map<Enum, Integer> truckTypeMap) {
////        System.out.println("TRUCK TYPES AND THEIR OCCURRENCES ARE");
////        for (Map.Entry<Enum, Integer> entry : truckTypeMap.entrySet()) {
////            Enum key = entry.getKey();
////            Integer value = entry.getValue();
////            System.out.println(key + " TRUCKS: " + value + " PIECE(S)");
////        }
////    }
////
////
////    public <T extends Enum> void countTruckAttribute(ArrayList<Truck> trucks, Enum<T> e) {
////        Map<Enum, Integer> attributeMap = new HashMap<>();
////        for (int i = 0; i < trucks.size(); i++) {
////            if (attributeMap.containsKey(trucks.get(i).e.values()[i])) {
////                int count = attributeMap.get(trucks.get(i).e.values()[i]);
////                attributeMap.put(trucks.get(i).e.values()[i], count + 1);
////            } else {
////                attributeMap.put(trucks.get(i).e.values()[i], 1);
////            }
////        }
////        printTypeMap(attributeMap);
////    }
////
//public void getMostCommonTruck(ArrayList<Truck> trucks) {
//        Map<Truck, Integer> mostCommonTruckMap = new HashMap<>();
//        for (Truck truck : trucks) {
//        if (mostCommonTruckMap.containsKey(truck)) {
//        int count = mostCommonTruckMap.get(truck);
//        mostCommonTruckMap.put(truck, count + 1);
//        } else {
//        mostCommonTruckMap.put(truck, 1);
//        }
//        }
//        Map.Entry<Truck, Integer> maxEntry = null;
//        for(Map.Entry<Truck, Integer> entry : mostCommonTruckMap.entrySet()){
//        if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
//        maxEntry = entry;
//        }
//        System.out.println("MOST COMMON COLOR-TYPE COMBINATION IS: " + maxEntry.getKey().color + "-" + maxEntry.getKey().type);;
//        }
//
////}
