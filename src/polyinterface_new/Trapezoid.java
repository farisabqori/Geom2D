package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Trapezoid implements Geom2D{

    private double bottom = 0;
    private double top = 0;
    private double height = 0;
    private double italic = 0;
    private int price = 18000;

    public int getPrice() {
        return price;
    }

    public Trapezoid(double bottom, double top, double height, double italic){
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        this.italic = italic;
    }

    public Trapezoid(double bottom, double top, double height){
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    public double getArea() {
        return 0.5*(top + bottom)*height;
    }


    public double getPerimeter() {
        if (italic != 0) {
            return 2 * italic + top + bottom;
        } else {
            return Math.sqrt(Math.pow(0.5*(bottom - top), 2) + Math.pow(height, 2));
        }

    }

    public void showPrice(){
        System.out.println("Price for make Trapezoid for 1 meter area: " + price);
    }


    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillPolygon(new int[] {50, 90, 190, 230}, new int[] {150, 20, 20, 150}, 4);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
