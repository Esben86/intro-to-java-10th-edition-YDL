package ch8;
import java.util.Scanner;

public class Chapter_08_E25_MarkovMatrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] m = new double[3][3];
		
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				m[i][j] = input.nextDouble();
		
		
		System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is not a Markov matrix");

	}
	
	public static boolean isMarkovMatrix(double[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			double sum = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] < 0)
					return false;
				sum += m[j][i];	
			}
			if (sum != 1)
				return false;
		}
		return true;
	}

}
