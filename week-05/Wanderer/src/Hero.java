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


    public void turnRight(int[][] board) {
        if (this.posX != 9 && board[this.posY][this.posX + 1] != 1) {
            this.posX += 1;
        }
        try {
            this.image = ImageIO.read(new File(picRight));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnLeft(int[][] board) {
        if (this.posX != 0 && board[this.posY][this.posX - 1] != 1) {
            this.posX -= 1;
        }
        try {
            this.image = ImageIO.read(new File(picLeft));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnUp(int[][] board) {
        if (posY != 0 && board[posY - 1][posX] != 1) {
            posY -= 1;
        }
        try {
            this.image = ImageIO.read(new File(picUp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnDown(int[][] board) {
        if (this.posY != 9 && board[this.posY + 1][this.posX] != 1) {
            this.posY += 1;
        }
        try {
            this.image = ImageIO.read(new File(picDown));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
