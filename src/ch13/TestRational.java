package ch13;

public class TestRational {

	public static void main(String[] args) {
		
		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(1, 2);
		Rational result = new Rational();
		
		result = r1.add(r2);
		
		System.out.println("r1 + r2 = " + result);
		
	}

}
