package polyinterface_new;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle implements Geom2D{

    private int length;
    private int wide;

    public Rectangle(int length, int wide){
        this.length = length;
        this.wide = wide;
    }
    public double getArea() {
        return length * wide ;
    }

    public double getPerimeter() {
        return 2*(length + wide);
    }

    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillOval(100, 100, 250, 250);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
