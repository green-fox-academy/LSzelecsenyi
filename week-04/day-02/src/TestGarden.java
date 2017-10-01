public class TestGarden {

    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addPlant(new Flowers("yellow"));
        garden.addPlant(new Flowers("blue"));
        garden.addPlant(new Trees("purple"));
        garden.addPlant(new Trees("orange"));

        garden.checkWatering(garden.plants);

        garden.water(garden.plants, 40);

        garden.checkWatering(garden.plants);

        garden.water(garden.plants, 70);

        garden.checkWatering(garden.plants);

        garden.checkWaterAmounts(garden);
    }
}
