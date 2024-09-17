package polyinterface_new;

import javax.swing.*;
import java.awt.*;

public class Parallelogram implements Geom2D {

    private double Height = 0;
    private double Italic = 0;
    private double Side = 0;

    public Parallelogram(double Height, double Italic, double Side){
        this.Height = Height;
        this.Italic = Italic;
        this.Side = Side;
    }

    public Parallelogram(double Height, double Side){
        this.Height = Height;
        this.Italic = Italic;
        this.Side = Side;
    }

    public double getArea() {
        return Side*Height;
    }

    public double getPerimeter() {
            return 2 * (Side + Italic);
    }

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
