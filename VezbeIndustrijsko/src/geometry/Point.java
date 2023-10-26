package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p1) {
		int dx = this.x - p1.getX();
		int dy = this.y - p1.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}