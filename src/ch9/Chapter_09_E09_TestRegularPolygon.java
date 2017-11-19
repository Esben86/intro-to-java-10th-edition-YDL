package ch9;

public class Chapter_09_E09_TestRegularPolygon {

	public static void main(String[] args) {
		
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(8, 6);
		RegularPolygon r3 = new RegularPolygon(12, 5, 6.6, 8.2);
		
		System.out.println("R1: [Perimeter = " + r1.getPerimeter() + "] [Area: " + r1.getArea() + "]");
		System.out.println("R2: [Perimeter = " + r2.getPerimeter() + "] [Area: " + r2.getArea() + "]");
		System.out.println("R3: [Perimeter = " + r3.getPerimeter() + "] [Area: " + r3.getArea() + "]");

	}

}
