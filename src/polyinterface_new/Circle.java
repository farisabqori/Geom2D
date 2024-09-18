package polyinterface_new;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle implements Geom2D {
	
	private double radius;



	private int price = 10000;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	public void showPrice(){
		System.out.println("Price for make circle for 1 meter area: " + price);
	}

	@Override
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
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "This is a circle with radius of length: " + radius;
	}

}
