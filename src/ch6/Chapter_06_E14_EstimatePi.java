package ch6;

public class Chapter_06_E14_EstimatePi {

	public static void main(String[] args) {
		
		System.out.printf("%2s %10s \n", "i", "m(i)");
		
		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%3d % 10.4f \n", i, estimatePI(i));
		}

	}
	
	public static double estimatePI(int n) {
		
		double sum = 0;
		
		for (double i = 1; i <= n; i++) {
			sum += Math.pow(-1, (i + 1)) / (2 * i - 1);
		}
		sum *= 4;
		
		return sum;
	}
}
