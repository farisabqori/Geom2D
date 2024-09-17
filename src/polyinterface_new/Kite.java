package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Kite implements Geom2D{
    private double longDiagonal = 0;
    private double shortDiagonal = 0;

    private double topSide = 0;
    private double bottomSide = 0;

    @Override
    public double getArea() {
        return 0.5*longDiagonal*shortDiagonal;
    }

    @Override
    public double getPerimeter() {
        return 2 * (topSide+bottomSide);
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
                g.fillRect(100, 100, 250, 250);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }
}
