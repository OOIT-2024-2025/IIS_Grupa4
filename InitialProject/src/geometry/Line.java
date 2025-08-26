package src.geometry;

public class Line {
	// property / svojstva
	// enkapsulacija - property private, metode pristupa (get/set) public
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public double length() {
		double d = startPoint.distance(endPoint);
		return d;
	}
	
	public String toString() {
		return startPoint.toString() + "-->" + endPoint;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint)
					&& this.endPoint.equals(pomocna.endPoint)
					&& this.selected == pomocna.selected)
				return true;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x, y);
		return this.startPoint.distance(sadrziTacku) + 
				this.endPoint.distance(sadrziTacku) - length() <= 2;
	}
	
	// metoda pristupa
	public Point getStartPoint() {
		return this.startPoint;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
