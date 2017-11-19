package ch6;

public class Chapter_06_E09_KilogramsToPounds {

	public static void main(String[] args) {
		
		System.out.printf("%-9s %12s %5s %10s %14s \n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		
		for (double kilograms = 1.0, pounds = 20.0; kilograms <= 199; kilograms += 2, pounds +=5) {
			
			System.out.printf("%-3.0f %18.3f %5s %7.0f %17.3f \n", 
					kilograms, kilogramToPound(kilograms), "|", pounds, poundToKilogram(pounds));
			
		}
	}
	
	public static double poundToKilogram(double pound) {
		return pound * 2.204;	
	}
	
	public static double kilogramToPound(double kilogram) {
		return kilogram * 0.453;	
	}

}
