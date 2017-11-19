package ch6;

public class Chapter_06_E08_MilesKMConversion {

	public static void main(String[] args) {
		
		System.out.printf("%-9s %15s %5s %14s %14s \n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
		
		for (double miles = 1.0, kilometers = 20.0; miles <= 10; miles++, kilometers +=5) {
			
			System.out.printf("%-2.0f %22.3f %5s %6.0f %23.3f \n", 
					miles, mileToKilometer(miles), "|", kilometers, kilometerToMile(kilometers));
			
		}
	}
	
	public static double mileToKilometer(double mile) {
		return mile * 1.6;	
	}
	
	public static double kilometerToMile(double kilometer) {
		return kilometer / 1.6;	
	}

}
