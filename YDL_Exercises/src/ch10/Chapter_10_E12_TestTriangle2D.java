package ch10;
import java.awt.geom.Line2D;

public class Chapter_10_E12_TestTriangle2D {

	public static void main(String[] args) {
		
		Triangle2D t1 = new Triangle2D();
		Triangle2D t2 = new Triangle2D(new MyPoint(2,1), new MyPoint(7,1), new MyPoint(5,5));
		Triangle2D t3 = new Triangle2D(3, 2, 6, 2, 4, 3);
		
		// Testing getPerimeter()
		System.out.println("Testing getPerimeter()");
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());
		System.out.println(t3.getPerimeter());
		
		// Testing getArea()
		System.out.println("\nTesting getArea()");
		System.out.println(t1.getArea());
		System.out.println(t2.getArea());
		System.out.println(t3.getArea());
		
		// Testing contains(MyPoint p)
		System.out.println("\nTesting contains(MyPoint p)");
		System.out.println(t1.contains(new MyPoint(4, 2.5)));
		System.out.println(t2.contains(new MyPoint(4, 2.5)));
		System.out.println(t3.contains(new MyPoint(4, 2.5)));
				
		// Testing overlaps(Triangle2D t)
		System.out.println("\nTesting overlaps(Triangle2D t)");
		System.out.println(t2.overlaps(t3)); // Should return false
		System.out.println(t2.overlaps(new Triangle2D(2, 2, 6, 2, 4, 3))); // Should return true
		
		// Testing contains(Triangle2D t)
		System.out.println("\nTesting contains(Triangle2D t)");
		System.out.println(t2.contains(t3)); // Should return true
		System.out.println(t2.contains(new Triangle2D(8, 5, 9.5, 5, 8.5, 6.5))); // Should return false, triangle outside, no intersecting lines
			
	}
}
