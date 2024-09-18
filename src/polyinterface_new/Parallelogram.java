package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Parallelogram implements Geom2D {

    private double Height = 0;
    private double Italic = 0;
    private double Side = 0;
    private int price = 15000;

    public int getPrice() {
        return price;
    }
    public Parallelogram(double Height, double Italic, double Side){
        this.Height = Height;
        this.Italic = Italic;
        this.Side = Side;
    }

    public Parallelogram(double Height, double Side){
        this.Height = Height;
        this.Side = Side;
    }

    public double getArea() {
        return Side*Height;
    }

    public double getPerimeter() {
            return 2 * (Side + Italic);
    }

    public void showPrice(){
        System.out.println("Price for make Parallelogram for 1 meter area: " + price);
    }

    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillPolygon(new int[] {50, 90, 230, 190}, new int[] {150, 20, 20, 150}, 4);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
