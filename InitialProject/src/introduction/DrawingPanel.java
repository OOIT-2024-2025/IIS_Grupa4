package src.introduction;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JPanel;

import src.geometry.Circle;
import src.geometry.Point;
import src.geometry.Rectangle;
import src.geometry.Shape;

public class DrawingPanel extends JPanel{
	
	public void paint(Graphics g) {
		Rectangle rectangle1 = new Rectangle(new Point(100,150), 50, 60);
		rectangle1.draw(g);
		
		Circle circle1 = new Circle(new Point(150, 205), 150);
		g.setColor(Color.red);
		circle1.draw(g);
		
		Shape rectangle2 = new Rectangle(new Point(200,350), 50, 60);
		rectangle2.draw(g);
		
		System.out.println(rectangle1.area());
		// System.out.println(rectangle2.area()); - kompajler gleda levu stranu
		rectangle1.draw(g);
		rectangle2.draw(g);
		Shape circle2 = new Circle(new Point(450, 520), 150);
		g.setColor(Color.green);
		circle2.draw(g);
		System.out.println(((Circle)circle2).area()); // downcast
		
		Circle circle3 = (Circle)circle2;
		circle3.area();
		
		// Prvi deo vežbi 8
		Point p81=new Point(50,60);
		Shape r81=new Rectangle(p81, 150,200);
		Shape c81=new Circle(p81, 50);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p81);
		shapes.add(r81);
		shapes.add(c81);
		Iterator<Shape> it = shapes.iterator(); 
		g.setColor(Color.yellow);
		while(it.hasNext()) {
			Shape tempShape = it.next();
			tempShape.draw(g);
			tempShape.moveBy(10, 0);
			tempShape.draw(g);
		}
		g.setColor(Color.black);
		it = shapes.iterator();
		while(it.hasNext()) {
			Shape tempShape = it.next();
			tempShape.draw(g);
			tempShape.moveBy(10, 0);
			tempShape.draw(g);
		}
		
	}

}
