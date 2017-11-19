package ch13;

public class Complex implements Cloneable {
	
	private double a = 0;
	private double b = 0;
	
	
	public Complex() {
		this(0, 0);
	}
	
	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
	
	public Complex add(Complex n) {
		return new Complex(a + n.getRealPart(), b + n.getImaginaryPart());
	}
	
	public Complex subtract(Complex n) {
		return new Complex(a - n.getRealPart(), b - n.getImaginaryPart());
	}
	
	public Complex multiply(Complex n) {
		double numReal = (a * n.a) - (b * n.b);
		double numImg = (b * n.a) + (a * n.b);
		
		return new Complex(numReal, numImg);
	}
	
	public Complex divide(Complex n) {
		double numReal = (a * n.a) + (b * n.b);
		double numImg = (b * n.a) - (a * n.b);
		double denom = (Math.pow(n.a, 2) + Math.pow(n.b, 2));
				
		return new Complex(numReal / denom, numImg / denom);
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	@Override
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}
	
	public String toString() {
		return "(" + Math.round(a * 100.0) / 100.0 + " + " + Math.round(b * 100.0) / 100.0 + "i)" ;
	}
	
}
