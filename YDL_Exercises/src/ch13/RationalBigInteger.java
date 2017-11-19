package ch13;
import java.math.BigInteger;

public class RationalBigInteger extends Number {
	
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	
	public RationalBigInteger() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	
	public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = numerator.gcd(denominator);
		
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) 
		? BigInteger.ONE : BigInteger.valueOf(-1)).multiply(numerator.divide(gcd));
		
		this.denominator = (denominator.divide(gcd)).abs();
	}
	
	public BigInteger getNumerator() {
		return numerator;
	}
	
	public BigInteger getDenominator() {
		return denominator;
	}
	
	public RationalBigInteger add(RationalBigInteger secondRational) {
		BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(
				(denominator.multiply(secondRational.getNumerator())));
				
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}
	
	public RationalBigInteger subtract(RationalBigInteger secondRational) {
		BigInteger n = (numerator.multiply(secondRational.getDenominator())).subtract(
				(denominator.multiply(secondRational.getNumerator())));
				
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}
	
	public RationalBigInteger multiply(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());		
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}
	
	public RationalBigInteger divide(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());		
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new RationalBigInteger(n, d);
	}
	
	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
		
	@Override
	public boolean equals(Object other) {
		return (((this.subtract((RationalBigInteger)(other))).getNumerator().compareTo(BigInteger.ZERO) == 0));
	}
	
	@Override
	public int intValue() {
		return (int)this.doubleValue();
	}
	
	@Override
	public double doubleValue() {
		return this.getNumerator().doubleValue() /
				this.getDenominator().doubleValue();
	}
	
	@Override
	public float floatValue() {
		return (float)this.doubleValue();
	}
	
	@Override
	public long longValue() {
		return (long)this.doubleValue();
	}
			
}
