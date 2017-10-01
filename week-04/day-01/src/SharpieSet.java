import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpieSet;

    public SharpieSet() {
        this.sharpieSet = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpieSet.add(sharpie);
    }

    public int countUsable() {
        int usable = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkNumber > 0) {
                usable++;
            }
        }
        return usable;
    }

    public int removeTrash() {
        List<Integer> removed = new ArrayList<>();
        int trash = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkNumber == 0) {
                trash++;

            }
        }
        return trash;
    }

}
