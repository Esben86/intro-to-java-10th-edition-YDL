package ch9;

public class Chapter_09_E08_TestFan {

	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(12);
		fan1.setColor("green");
		fan1.turnOn();
		
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(6);
		fan2.setColor("red");
		fan2.turnOff();
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}
