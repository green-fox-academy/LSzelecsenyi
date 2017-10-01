import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){

        triangles(graphics, 600, 0, 0, 0);

        int side = 600;
        double squareRoot3 = Math.sqrt(3);
        double height = (squareRoot3 * side) / 2;
        int zeroBX = side;
    }

    public static void triangles(Graphics graphics,) {
        int side = 600;
        double squareRoot3 = Math.sqrt(3);
        double height = (squareRoot3 * side) / 2;
        int zeroBX = side;
        int[] xPoints = {0, side, side / 2};
        int[] yPoints = {0, 0, (int) height};
        graphics.drawPolygon(xPoints, yPoints, 3){


        }
    }




    //    Don't touch the code below
    static int WIDTH = 620;
    static int HEIGHT = 643;

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