package ch10;

public class Circle2D {

	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this(0, 0, 3);
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt((Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2))) <= radius;	
	}
	
	public boolean contains(Circle2D circle) {
		return Math.sqrt((Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2))) 
				<= (this.radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt((Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2))) 
				<= (this.radius + circle.getRadius());
	}
	
}
