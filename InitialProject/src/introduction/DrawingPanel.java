package src.introduction;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JPanel;

import src.geometry.Circle;
import src.geometry.Point;
import src.geometry.Rectangle;

public class DrawingPanel extends JPanel{
	
	public void paint(Graphics g) {
		Rectangle rectangle1 = new Rectangle(new Point(100,150), 50, 60);
		rectangle1.draw(g);
		
		Circle circle1 = new Circle(new Point(150, 205), 150);
		g.setColor(Color.red);
		circle1.draw(g);
	}

}
