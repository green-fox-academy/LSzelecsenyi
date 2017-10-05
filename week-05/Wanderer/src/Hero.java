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
        changePic(new File(picRight));
    }

    public void turnLeft(int[][] board) {
        if (this.posX != 0 && board[this.posY][this.posX - 1] != 1) {
            this.posX -= 1;
        }
        changePic(new File(picLeft));
    }

    public void turnUp(int[][] board) {
        if (posY != 0 && board[posY - 1][posX] != 1) {
            posY -= 1;
        }
        changePic(new File(picUp));
    }

    public void turnDown(int[][] board) {
        if (this.posY != 9 && board[this.posY + 1][this.posX] != 1) {
            this.posY += 1;
        }
        changePic(new File(picDown));
    }

    private void changePic(File input) {
        try {
            this.image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
