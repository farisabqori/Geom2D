package polyinterface_new;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Square implements Geom2D {
	
	private double side;
	private int price = 6000;

	public int getPrice() {
		return price;
	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

	public void showPrice(){
		System.out.println("Price for make Square for 1 meter area: " + price);
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
