package ch13;

public class Octagon extends GeometricObject 
	implements Comparable<Octagon>, Cloneable {

	private double side = 1;
	
	public Octagon() {
		
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getPerimeter() {
		return side * 8;
	}
	
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * Math.pow(getSide(), 2));
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
	@Override 
	public boolean equals(Object o) {
		return this.compareTo((Octagon)o) == 0;
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		Octagon octagonClone = (Octagon)super.clone();
		
		octagonClone.dateCreated = (java.util.Date)(dateCreated.clone());
		
		return octagonClone;
	}
	
	@Override
	public String toString() {
		return "Side: " + getSide() +
			   "\nArea :" + getArea();
	}
	
}
