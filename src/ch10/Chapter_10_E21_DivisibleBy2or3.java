package ch10;
import java.math.BigInteger;

public class Chapter_10_E21_DivisibleBy2or3 {

	public static void main(String[] args) {
		
		BigInteger value = new BigInteger(String.valueOf(Long.MAX_VALUE)).add(BigInteger.ONE);
		int count = 0;
		
		while (count < 10) {
			
			if (value.mod(new BigInteger("2")).equals(BigInteger.ZERO) || value.mod(new BigInteger("3")).equals(BigInteger.ZERO)) {
				count++;
				
				System.out.println(value);
				
			}
			value = value.add(BigInteger.ONE);
		}

	}

}
