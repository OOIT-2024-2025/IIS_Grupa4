package src.geometry;

public class Point {
	// atributi klase
	// enkapsulacija
	private int xCoord;
	private int yCoord;
	private boolean selected;

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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
