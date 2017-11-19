package ch9;
import java.util.GregorianCalendar;
import java.util.Date;

public class Chapter_09_E05_GregorianCalendar {

	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH) + " / " + 
						   (calendar.get(GregorianCalendar.MONTH) + 1) + " / " +
						   calendar.get(GregorianCalendar.YEAR));
		
		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH) + " / " + 
				   (calendar.get(GregorianCalendar.MONTH) + 1) + " / " +
				   calendar.get(GregorianCalendar.YEAR));
		

	}

}
