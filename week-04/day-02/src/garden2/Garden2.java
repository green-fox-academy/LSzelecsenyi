package garden2;

import java.util.ArrayList;

public class Garden2 {
    ArrayList<Plants2> plants;

    public Garden2() {
        ArrayList<Plants2> plants = new ArrayList<>();
    }

    //CHECK WATERING
    public void checkWateringNeed(ArrayList<Plants2> plants) {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isDry) {
                System.out.println(plants.get(i).getColor() + plants.get(i).getType() + " needs watering ");
            }
        }
    }

    //WATERING THE PLANTS
    public void watering(ArrayList<Plants2> plants, int litres) {
        System.out.println("Watering with " + litres + " litres");
        int needsWatering = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isDry) {
                needsWatering++;
            }
        }
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).isDry) {
                plants.get(i).waterAmount += plants.get(i).waterAbsorbCap * (litres / needsWatering);
                plants.get(i).setNeed();
            }
        }
    }

    public void addPlant(Plants2 plant) {
        plants.add(plant);
    }


    public static void main(String[] args) {

        Garden2 garden = new Garden2();

        garden.addPlant(new Flowers2("yellow"));
        garden.addPlant(new Flowers2("blue"));
        garden.addPlant(new Trees2("purple"));
        garden.addPlant(new Trees2("orange"));


        garden.checkWateringNeed(garden.plants);
        garden.watering(garden.plants,45);
        System.out.println();
        garden.checkWateringNeed(garden.plants);
        garden.watering(garden.plants,70);
    }
}
