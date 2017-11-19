package ch11;

public class Chapter_11_E01_TestTriangle {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		
		System.out.println(triangle1.toString());
		System.out.println("What color is the triangle? " + triangle1.getColor());
		System.out.println("Is the triangle filled? " + triangle1.isFilled());
		System.out.println("The triangle perimeter is: " + triangle1.getPerimeter());
		System.out.println("The triangle area is: " + triangle1.getArea());
		
		Triangle triangle2 = new Triangle(3, 3, 3, "blue", true);
		System.out.println();
		
		System.out.println(triangle2.toString());
		System.out.println("What color is the triangle? " + triangle2.getColor());
		System.out.println("Is the triangle filled? " + triangle2.isFilled());
		System.out.println("The triangle perimeter is: " + triangle2.getPerimeter());
		System.out.println("The triangle area is: " + triangle2.getArea());

	}

}
