package ch9;

public class Rectangle {
	
	public double width = 1;
	public double height = 1;
	
	
	Rectangle() {	
	}
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return (2 * height) + (2 * width);
	}

}
