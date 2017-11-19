package ch10;
import java.math.BigInteger;

public class Chapter_10_E18_LargePrimeNumbers {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
		int count = 0;
		
		
		while (count < 10) {
			
			System.out.println(n.nextProbablePrime());
			n = n.nextProbablePrime();
			count++;	
		}
			
	}
}
