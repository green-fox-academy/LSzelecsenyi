/*
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void ConnectTheDots(Graphics graphics){

        // create a function that takes 1 parameter:

        // an array of {x, y} points

        // and connects them with green lines.

        // connect these to get a box: {{10, 10}, {290, 10}, {290, 290}, {10, 290}}

        // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},

        // {120, 100}, {85, 130}, {50, 100}}

        int[][] dots = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] dots2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        connectTheDots(graphics, dots);
        connectTheDots(graphics, dots2);

    }

    private static void connectTheDots(Graphics graphics, int[][] dots) {
        int i;
        for (i = 0; i < dots.length; i++)
            graphics.setColor(Color.RED);
            graphics.drawLine(dots[i][0], dots[i][i + 1], dots[i + 1][0],dots[i + 1][1]);
    }

// Don't touch the code below

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

}*/
