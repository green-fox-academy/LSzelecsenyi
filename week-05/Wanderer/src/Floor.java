public class Floor extends Tile {

    public Floor(int posX, int posY) {
        super("Assets/floor.png", posX, posY);
    }

    public void setOccupied(int X, int Y) {
        isEmpty = false;
    }
}
