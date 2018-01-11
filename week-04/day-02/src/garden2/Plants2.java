package garden2;

public class Plants2 {
    String color;
    String type;
    double needsWaterLevel;
    double waterAmount;
    boolean isDry;
    double waterAbsorbCap;

    public Plants2(String color, String type, double waterAbsorbCap, double needsWaterLevel) {
        this.color = color;
        this.type = type;
        this.waterAmount = 0d;
        this.waterAbsorbCap = waterAbsorbCap;
        this.needsWaterLevel = needsWaterLevel;
    }

    public boolean setNeed() {
        if (this.waterAmount < this.needsWaterLevel) {
            this.isDry = true;
        } else {
            this.isDry = false;
        } return this.isDry;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
