package ch6;

public class Chapter_06_E28_MersennePrime {

	public static void main(String[] args) {

		double p = 2;
		
		System.out.printf("%-12s %10s \n", "p", "2^p - 1");
		
		while (p <= 31) {
			
			if (isPrime(p) && isPrime(Math.pow(2, p) - 1)) {
				System.out.printf("%-10.0f %12.0f \n", p, Math.pow(2, p) - 1);
				
			}
			p++;	
		}
	}
	
	public static boolean isPrime(double n) {
		
		for (int divisor = 2; divisor <= n / 2; divisor++) {
			if (n % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
