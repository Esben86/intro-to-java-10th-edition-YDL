package ch9;

public class Fan {
	
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	Fan(){
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String speed = "Current speed is " + getSpeed() + ". ";
		String color = "Color is " + getColor() + ". ";
		String radius = "Radius is " + getRadius() + ".";
		
		return (on) ? speed + color + radius : "The fan is turned off. " + color + radius; 
		
	}
	
}
