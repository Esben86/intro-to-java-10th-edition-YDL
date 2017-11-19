package ch10;
import java.math.BigInteger;

public class Chapter_10_E19_MersennePrime {

	public static void main(String[] args) {
		
		int p = 2;
		
		System.out.printf("%-12s %10s \n", "p", "2^p - 1");
		
		while (p < 100) {
			
			if (isPrime(p)) {
				System.out.printf("%-10d %12s \n", p, new BigInteger("2").pow(p).subtract(BigInteger.ONE));
			}
			p++;
		}

	}
	
	public static boolean isPrime(int p) {
		
		for (int i = 2; i <= Math.sqrt(p); i++) {
			
			if (p % i == 0)
				return false;
		}
		return true;
	}
	
}
