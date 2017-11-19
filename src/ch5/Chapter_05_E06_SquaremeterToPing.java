package ch5;

/**
 * Chapter 5 Exercise 6:
 *
 * (Conversion from square meter to ping)
 *
 */

public class Chapter_05_E06_SquaremeterToPing {

	public static void main(String[] args) {
		
		System.out.printf("%-12s %8s", "Ping", "Square meter");
		System.out.printf("\t|\t");
		System.out.printf("%-12s %8s", "Square meter", "Ping\n");
		
		for (int ping = 10, squaremeter = 30; ping <= 80; ping += 5, squaremeter += 5) {
			System.out.printf("%-12d %12.3f", ping, ping * 3.305);
			System.out.printf("\t|\t");
			System.out.printf("%-12d %7.3f\n", squaremeter, squaremeter / 3.305);
		}

	}

}
