package ch6;

public class Chapter_06_E13_SumASeries {

	public static void main(String[] args) {
		
		double sum = 0;
		
		System.out.printf("%2s %10s \n", "I", "m(i)");
		
		for (double i = 1.0; i <= 20; i++) {
			sum += sum(i);
			System.out.printf("%2.0f %12.4f \n", i, sum);	
		}
	}
	
	public static double sum(double n) {
		
		return (double) n  / (n + 2);
		
	}
}
