package ch10;
import java.math.BigInteger;

public class Chapter_10_E16_DivisibleBy3or5 {

	public static void main(String[] args) {
		
		String numString = "" + 1;
		int count = 0;
		
		for (int i = 0; i <= 49; i++)
			numString += "0";
		
		BigInteger num = new BigInteger(numString);
				
		while (count < 50) {
			
			if (num.mod(new BigInteger("3")).equals(BigInteger.ZERO) || num.mod(new BigInteger("5")).equals(BigInteger.ZERO)) {
				count++;
				
				System.out.println(num);
				
			}
			num = num.add(BigInteger.ONE);
		}

	}

}
