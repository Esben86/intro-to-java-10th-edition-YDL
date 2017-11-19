package ch10;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Chapter_10_E20_ApproximateE {

	public static void main(String[] args) {
		
		BigDecimal one = new BigDecimal(1);
		BigDecimal e = new BigDecimal(1.0);
		BigDecimal divisor = new BigDecimal(1.0);
				
		for (int i =  1; i <= 1200; i++) {
			
			divisor = divisor.multiply(new BigDecimal(i));
			e = e.add(one.divide(divisor, 25, RoundingMode.HALF_UP));
			
			if (i % 100 == 0) {
			System.out.println("i = " + i + " e = " + e);
			}
		}
	}
}
