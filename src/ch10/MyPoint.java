package ch10;

public class MyPoint {
	
	private double x;
	private double y;
	
	public MyPoint() {
		this(0, 0);
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint p) {
		return Math.sqrt(Math.pow(this.y - p.y, 2) + Math.pow(this.x - p.x, 2));	
	}
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.y - y, 2) + Math.pow(this.x - x, 2));	
	}
		
}
