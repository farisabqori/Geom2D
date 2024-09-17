package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Triangle implements Geom2D{

    private double bottom = 0;
    private double height = 0;
    private double italic = 0;
    public Triangle(double bottom, double height, double italic){
        this.bottom = bottom;
        this.height = height;
        this.italic = italic;
    }

    public Triangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    public double getArea() {
        return 0.5*(bottom*height);
    }


    public double getPerimeter() {
        if (italic != 0){
            return (italic*2)+bottom;
        }
        return Math.sqrt(Math.pow(height, 2) + Math.pow(bottom*0.5, 2));
    }

    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillPolygon(new int[] {50, 100, 150}, new int[] {150, 20, 150}, 3);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
