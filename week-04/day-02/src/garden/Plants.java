package garden;

public class Plants {

    double waterAmount;
    String color;
    double waterAbsorbingCapacity;

    public Plants(String color) {
        this.color = color;
        this.waterAmount = 0d;
    }

    public String getColor() {
        return color;
    }
}
