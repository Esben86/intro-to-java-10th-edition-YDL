package ch9;
import java.util.Scanner;

public class Chapter_09_E11_TestLinearEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation lq = new LinearEquation(a, b, c, d, e, f);
		
		System.out.println(lq.isSolvable(a, b, c, d) ?  "X = " + lq.getX(a, b, c, d, e, f) + 
										" and Y = " + lq.getY(a, b, c, d, e, f) : "The equation has no solution");
			

	}

}
