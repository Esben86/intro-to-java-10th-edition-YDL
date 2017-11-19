package ch7;
import java.util.Scanner;

public class Chapter_07_E33_ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String zodiac[] = {"monkey", "rooster", "dog", "pig", "rat", "ox", 
							"tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println(zodiac[year % 12]);

	}

}
