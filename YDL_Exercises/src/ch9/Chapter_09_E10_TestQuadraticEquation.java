package ch9;
import java.util.Scanner;

public class Chapter_09_E10_TestQuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter values ax^2, bx and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation eq = new QuadraticEquation(a, b, c);
		
		if (eq.getDiscriminant() > 0)
			System.out.println("The equation has two roots " + eq.getRoot1() + " and " + eq.getRoot2());
			else if (eq.getDiscriminant() == 0) 
				System.out.println("The equation has one root " + eq.getRoot1());
		else
			System.out.println("The equation has no real roots");

	}

}
