import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void mainDraw(Graphics graphics){


        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, 605, 605);
        graphics.setColor(Color.BLACK);

        sierpinsky(graphics, 600, 600);

    }


    static void sierpinsky(Graphics graphics, int width, int height) {
        if (width < 50)
            return;
        } else {
        graphics.drawLine((int) (width * 0.33), 0, (int) (width * 0.33), height);
        graphics.drawLine((int) (width * 0.66), 0, (int) (width * 0.66), height);
        graphics.drawLine(0, (int) (height * 0.33) , width, (int) (height * 0.33));
        graphics.drawLine(0, (int) (height * 0.66), width, (int) (height * 0.66));
        sierpinsky(graphics, width / 3, height / 3);
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