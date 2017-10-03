import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int[][] table = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
        };

    int heroPosX;
    int heroPosY;

    public Board() {
        heroPosX = 0;
        heroPosY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }


//    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int column = 0; column < 10; column++) {
            for (int row = 0; row < 10; row++) {
                    PositionedImage floor = new PositionedImage("Assets/floor.png", row, column);
                    PositionedImage wall = new PositionedImage("Assets/wall.png", row, column);
                if (table[column][row] == 0) {
                    floor.draw(graphics);
                } else if (table[column][row] == 1) {
                    wall.draw(graphics);
                }
            }
        }

        PositionedImage hero = new PositionedImage("Assets/hero-down.png", heroPosX, heroPosY);
        hero.draw(graphics);
    }


    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP && table[heroPosY - 1][heroPosX] != 1 && ) {
            heroPosY -= 1;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && table[heroPosY + 1][heroPosX] != 1) {
            heroPosY += 1;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && table[heroPosY][heroPosX + 1] != 1) {
            heroPosX += 1;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT && table[heroPosY][heroPosX - 1] != 1) {
            heroPosX -= 1;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}