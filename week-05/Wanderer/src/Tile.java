
public class Tile extends PositionedImage {
    boolean isEmpty;

    public Tile(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.isEmpty = true;
    }

}
