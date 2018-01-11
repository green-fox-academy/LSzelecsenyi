package garden;

import java.util.ArrayList;

public class Garden extends ArrayList<Plants> {

    ArrayList<Plants> plants;

    public void addPlant(Plants plant) {
        plants.add(plant);
    }

    public Garden() {
        this.plants = new ArrayList<Plants>();
    }

    public void checkWatering(ArrayList<Plants> plants) {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Flowers && plants.get(i).waterAmount < 5) {
                System.out.println("The " + plants.get(i).getColor() + " flower needs water");
            } else if (plants.get(i) instanceof Trees && plants.get(i).waterAmount < 10) {
                System.out.println("The " + plants.get(i).getColor() + " tree needs water");
            }
        }
        System.out.println();
    }

    public void water(ArrayList<Plants> plants, int litres) {
        System.out.println("Watering with " + litres + " litres");
        int needsWatering = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Flowers && plants.get(i).waterAmount < 5) {
                needsWatering++;
            }
            if (plants.get(i) instanceof Trees && plants.get(i).waterAmount < 10) {
                needsWatering++;
            }
        }
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Flowers && plants.get(i).waterAmount < 5) {
                plants.get(i).waterAmount += plants.get(i).waterAbsorbingCapacity * (litres / needsWatering);
            }
            if (plants.get(i) instanceof Trees && plants.get(i).waterAmount < 10) {
                plants.get(i).waterAmount += plants.get(i).waterAbsorbingCapacity * (litres / needsWatering);
            }
        }
    }
}
