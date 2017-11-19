package ch9;
import java.util.Date;

public class Chapter_09_E03_Date {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		for (long i = 12000; i <= 120000000000L; i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}
