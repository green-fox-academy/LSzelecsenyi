import javax.swing.*;
import javax.xml.stream.events.Characters;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    int level = 1;
    Hero hero;
    Boss boss;
    String heroImage = "Assets/hero-down.png";
    ArrayList<Monster> monsters;
    int[][] board = new int[][]{
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

    public Board() {
        hero = new Hero();
        boss = new Boss();
        monsters = new ArrayList<>();
        monsters.add(new Monster(1));
        monsters.add(new Monster(2));
        monsters.add(new Monster(3));
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);

        while (board[boss.posY][boss.posX] != 0) {
            boss.posGen();
        }

        for (Character ch : monsters) {
            while (board[ch.posY][ch.posX] != 0) {
                ch.posGen();
            }
        }
    }

//    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int column = 0; column < 10; column++) {
            for (int row = 0; row < 10; row++) {
                    PositionedImage floor = new PositionedImage("Assets/floor.png", row, column);
                    PositionedImage wall = new PositionedImage("Assets/wall.png", row, column);
                if (board[column][row] == 0) {
                    floor.draw(graphics);
                } else if (board[column][row] == 1) {
                    wall.draw(graphics);
                }
            }
        }
        PositionedImage hiro = new PositionedImage(heroImage, hero.posX, hero.posY);
        hiro.draw(graphics);

        PositionedImage bosz = new PositionedImage(boss.picBoss, boss.posX, boss.posY);
        bosz.draw(graphics);

        for (int i = 0; i < monsters.size(); i++) {
        PositionedImage monszter = new PositionedImage(monsters.get(i).picMonster, monsters.get(i).posX, monsters.get(i).posY);
        monszter.draw(graphics);
        }


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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroImage = hero.picUp;
            if (hero.posY != 0 && board[hero.posY - 1][hero.posX] != 1) {
                hero.posY -= 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroImage = hero.picDown;
            if (hero.posY != 9 && board[hero.posY + 1][hero.posX] != 1) {
                hero.posY += 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroImage = hero.picRight;
            if (hero.posX != 9 && board[hero.posY][hero.posX + 1] != 1) {
                hero.posX += 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroImage = hero.picLeft;
            if (hero.posX != 0 && board[hero.posY][hero.posX - 1] != 1) {
                hero.posX -= 1;
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

    public int getLevel() {
        return level;
    }
}