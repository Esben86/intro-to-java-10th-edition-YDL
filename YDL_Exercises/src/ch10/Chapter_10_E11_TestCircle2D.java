package ch10;

public class Chapter_10_E11_TestCircle2D {

	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(2, 2, 2.5);
		
		System.out.println("c1 area: " + c1.getArea());
		System.out.println("c1 perimeter: " + c1.getPerimeter());
		System.out.println("Is point (3,3) within c1? " + c1.contains(3, 3));
		System.out.println("Is new Circle2D(4, 5, 8.5) within c1? " + c1.contains(new Circle2D(4, 5, 8.5)));
		System.out.println("Does c1 over lap new Circle(3, 5, 0.3)? " + c1.overlaps(new Circle2D(3, 5, 0.3)));
				
	}

}
