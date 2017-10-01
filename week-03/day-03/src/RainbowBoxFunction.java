import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.

        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};

        rainbow(graphics, 300, colors);

    }



    public static void rainbow(Graphics graphics, int size, Color[] color) {
        int coordinates = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                size = 300;
                graphics.setColor(color[i]);
                graphics.fillRect(coordinates, coordinates, size, size);
            } else {
                size -= 50;
                coordinates += 25;
                graphics.setColor(color[i]);
                graphics.fillRect(coordinates, coordinates, size, size);
            }
        }
    }


/*    public static void rainbow(Graphics graphics, int[] size, String[] color) {
        int[] coordinates = {0, 25, 50, 75, 100, 125};
        for (int i = 0; i < size.length; i++) {
            graphics.setColor(Color.getColor(color[i]));
            graphics.fillRect(coordinates(i), coordinates(i), size(i), size(i));

        }*/



    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}