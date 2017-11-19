package ch1;

/**
 * Chapter 1 Exercise 7:
 *      (Approximate) pi can be computed using the following formula:
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 */

public class Chapter_01_E07_Approximate {

	public static void main(String[] args) {
		
		double approx1 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println(approx1);

		double approx2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
		System.out.println(approx2);
	}

}
