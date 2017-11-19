package ch9;

public class Chapter_09_E01_TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("r1: [Width = " + r1.width + "] [Height = " + r1.height + 
							"] [Area = " + r1.getArea() + "] [Perimiter = " + r1.getPerimeter() + "]");
		
		System.out.println("r2: [Width = " + r2.width + "] [Height = " + r2.height + 
				"] [Area = " + r2.getArea() + "] [Perimiter = " + r2.getPerimeter() + "]");

	}

}
