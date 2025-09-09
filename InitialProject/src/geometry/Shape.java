package src.geometry;

import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable{
	protected boolean selected;

	// ima konstruktore
	public Shape() {

	}

	public Shape(boolean selected) {
		this.selected = selected;
	}
	
	// koja ima bar jednu apstraktnu metodu
	public abstract boolean contains(int x, int y);
	
	public abstract void draw(Graphics g);
	
	public abstract boolean equals(Object obj);
	
	public abstract String toString();
	
	// metode pristupa
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

	
}
