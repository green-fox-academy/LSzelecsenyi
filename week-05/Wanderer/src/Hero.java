import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    String picDown;
    String picUp;
    String picLeft;
    String picRight;

    public Hero() {
        super("Assets/hero-down.png", 0, 0);
        maxHP = maxHP + d6.dice() + d6.dice() + d6.dice();
        defend = d6.dice() + d6.dice();
        strike = 5 + d6.dice();
        this.picDown = "Assets/hero-down.png";
        this.picUp = "Assets/hero-up.png";
        this.picLeft = "Assets/hero-left.png";
        this.picRight = "Assets/hero-right.png";
    }

    public void turnRight() {
        try {
            this.image = ImageIO.read(new File(picRight));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnLeft() {
        try {
            this.image = ImageIO.read(new File(picLeft));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnUp() {
        try {
            this.image = ImageIO.read(new File(picUp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnDown() {
        try {
            this.image = ImageIO.read(new File(picDown));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
