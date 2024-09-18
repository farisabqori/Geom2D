package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Kite implements Geom2D{
    private double longDiagonal = 0;
    private double shortDiagonal = 0;

    private double topSide = 0;
    private double bottomSide = 0;

    private int price = 12000;

    public Kite(double longDiagonal, double shortDiagonal, double topSide, double bottomSide){
        this.longDiagonal = longDiagonal;
        this.shortDiagonal = shortDiagonal;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    };

    public int getPrice() {
        return price;
    }
    @Override
    public double getArea() {
        return 0.5*longDiagonal*shortDiagonal;
    }

    @Override
    public double getPerimeter() {
        return 2 * (topSide+bottomSide);
    }

    public void showPrice(){
        System.out.println("Price for make Kite for 1 meter area: " + price);
    }

    @Override
    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillPolygon(new int[] {50, 100, 150, 100}, new int[] {50, 20, 50, 150}, 4);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
