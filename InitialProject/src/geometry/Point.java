package src.geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{
	// atributi klase
	// enkapsulacija
	private int xCoord;
	private int yCoord;
	
	// konstruktori
	public Point() {
		
	}
	
	/* razliciti potpisi pa moze overloading
	 * Point
	 * Point int int
	 * Point boolean int 
	 */
	
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public Point(int xCoord, int yCoord, boolean selected) {
		// this.xCoord = xCoord;
		// this.yCoord = yCoord;
		this(xCoord, yCoord);
		this.selected = selected;
	}
	

	public double distance(Point point2) {
		double dx = xCoord - point2.xCoord;
		double dy = this.yCoord - point2.yCoord;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	public double distance(int xCoord, int yCoord) {
		double dx = this.xCoord - xCoord;
		double dy = this.yCoord - yCoord;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	public boolean contains(int x, int y) {
		if (this.distance(x, y) <= 2)
			return true;
		return false;
	}
	
	// overriding - prilagodjavanje nasledjene metode
	// toString za Point po default-u koristiti toString metodu iz klase Object
	// ta metoda ispisuje referencu i posto se nama to ne dopada
	// mi cemo tu metodu prilagoditi
	
	// mora da ima isti potpis metode kao metoda u klasi object
	public String toString() {
		return "("+ xCoord + "," + yCoord + "), selected = " + selected;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// down castovanje - konverziju object u Point
			Point drugaTacka = (Point) obj;
			if (this.xCoord == drugaTacka.xCoord && 
					this.yCoord == drugaTacka.yCoord)
				return true;
		}
		return false;
	}
	
	public void draw(Graphics g) {
		g.drawLine(xCoord-2, yCoord, xCoord+2, yCoord);
		g.drawLine(xCoord, yCoord-2, xCoord, yCoord+2);
		
		if(selected) {
			g.setColor(Color.blue);
			g.drawRect(xCoord-2, yCoord-2, 4, 4);
			g.setColor(Color.black);
		}
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
		
	}

	@Override
	public void moveBy(int x, int y) {
		this.xCoord += x;
		this.yCoord += y;
		
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point shapeToCompare = (Point)o;
			return (int)this.distance(new Point(0,0))
					- (int)shapeToCompare.distance(new Point(0,0));
		}
		return 0;
	}

	public int getXCoord() {
		return xCoord;
	}

	public void setXCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getYCoord() {
		return yCoord;
	}

	public void setYCoord(int yCoord) {
		this.yCoord = yCoord;
	}



}
