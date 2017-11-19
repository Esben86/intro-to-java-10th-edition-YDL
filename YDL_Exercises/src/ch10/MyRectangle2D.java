package ch10;

public class MyRectangle2D {
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}
	
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return ((2 * width) + (2 * height));
	}
	
	public boolean contains(double x, double y) {		
		return (Math.abs(this.x - x) <= width / 2) && (Math.abs(this.y - y) <= height / 2);
	}
	
	public boolean contains(MyRectangle2D r) {
		double xDistance = Math.abs(this.x - x);
		double yDistance = Math.abs(this.y - y);
		
		return xDistance < ((this.width - r.getWidth()) / 2) && yDistance < ((this.height - r.getHeight()) / 2);
	}
	
	public boolean overlaps(MyRectangle2D r) {
		double xDistance = Math.abs(this.x - x);
		double yDistance = Math.abs(this.y - y);
		
		return xDistance < ((this.width + r.getWidth()) / 2) && yDistance < ((this.height + r.getHeight()) / 2);
	}
	
	public static MyRectangle2D getRectangle(double[][] points) {
				
		double highest = points[0][1];
		double lowest = points[0][1];
		double rightMost = points[0][0];
		double leftMost = points[0][0];
		
		for (int i = 0; i < points.length; i++) {
			
			for (int j = 0; j < points[i].length; j++) {
				
				if (points[i][1] > highest)
					highest = points[i][1];
				
				if (points[i][1] < lowest)
					lowest = points[i][1];
				
				if (points[i][0] > rightMost)
					rightMost = points[i][0];
				
				if (points[i][0] < leftMost)
					leftMost = points[i][0];		
			}	
		}
		
		double width = Math.abs(rightMost - leftMost);
		double height = Math.abs(highest - lowest);
		double centerX = (leftMost + rightMost) / 2;
		double centerY = Math.abs(lowest + highest) / 2;
		
		return new MyRectangle2D(centerX, centerY, width, height);
	}
		
}
