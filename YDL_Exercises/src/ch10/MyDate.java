package ch10;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	public static GregorianCalendar calendar = new GregorianCalendar();
	
	public MyDate() {
		this(calendar.get(calendar.DAY_OF_MONTH), calendar.get(calendar.MONTH) + 1, calendar.get(calendar.YEAR));
	}
	
	public MyDate(long elapsedTime) {
		calendar.setTimeInMillis(elapsedTime);
		this.day = calendar.get(calendar.DAY_OF_MONTH);
		this.month = calendar.get(calendar.MONTH) + 1;
		this.year = calendar.get(calendar.YEAR);		
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
		
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDate(long elapsedTime) {
		calendar.setTimeInMillis(elapsedTime);
		this.day = calendar.get(calendar.DAY_OF_MONTH);
		this.month = calendar.get(calendar.MONTH) + 1;
		this.year = calendar.get(calendar.YEAR);
	}

}
