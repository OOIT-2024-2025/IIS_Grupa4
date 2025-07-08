package src.geometry;

public class Line {
	// property / svojstva
	// enkapsulacija - property private, metode pristupa (get/set) public
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public double length() {
		double d = startPoint.distance(endPoint);
		return d;
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
