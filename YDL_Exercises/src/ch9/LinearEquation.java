package ch9;

public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {	
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getD(){
		return d;
	}
	
	public double getE(){
		return e;
	}
	
	public double getF(){
		return f;
	}
	
	public boolean isSolvable(double a, double b, double c, double d) {
		return ((a * d) - (b * c)) != 0;
	}
	
	public double getX(double a, double b, double c, double d, double e, double f) {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	public double getY(double a, double b, double c, double d, double e, double f) {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}
	
}
