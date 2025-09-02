package src.geometry;

import java.awt.Graphics;

public class Circle extends Shape{
	private Point center;
	private int radius;
	
	public Circle() {
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}
	
	public double area() { 
		return radius*radius*Math.PI;
	}
	public double circumference() { 
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle) obj;
			if (this.center.equals(pomocna.center) && this.radius == pomocna.radius)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x, y);
		return (this.center.distance(sadrziTacku) <= this.radius);
	}
	
	@Override
	public void draw(Graphics g) {
		// obratiti paznju na potpis metode drawOval!
		g.drawOval(center.getXCoord()-radius,
				center.getYCoord() - radius, 2* radius, 2*radius);
		
	}
	
	//metode pristupa 
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


}
