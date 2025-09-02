package src.geometry;

import java.awt.Graphics;

public class Donut extends Circle {
	// center, radius, selected nam ne trebaju jer ih imamo iz circle
	// private Point center;
	private int innerRadius;
	
	public Donut() {
		// prazan (default) konstruktor
		super();
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		//this.setCenter(center);
		//this.setRadius(radius);
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.setSelected(selected);
	}
	
	public String toString() {
		return super.toString() + ", innerRadius = " + getInnerRadius();
	}
	
	/*jedan nacin
	 * public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (this.getCenter().equals(pomocna.getCenter()) && 
					this.getRadius() == pomocna.getRadius() &&
					this.innerRadius == pomocna.innerRadius)
				return true;
			else
				return false;
		} else
			return false;
	}*/
	
	// drugi nacin
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (super.equals(pomocna) &&
					this.innerRadius == pomocna.innerRadius)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (super.contains(x, y) && 
				getCenter().distance(x,y)> innerRadius);
	}
	
	public double area() { 
		double area = super.area() - innerRadius*innerRadius*Math.PI;
		return area;
	}
	
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getXCoord()-innerRadius,
				getCenter().getYCoord()-innerRadius, 
				2*innerRadius, 2*innerRadius);
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public int getInnerRadius() {
		// moze i samo innerRadius
		return this.innerRadius;
	}

}
