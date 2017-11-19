package ch6;

public class Chapter_06_E33_CurrentDateAndTime {
	
	public static void main(String[] args) {
		
		showCurrentTimeAndDate();

	}
	
	/** Display current date and time */
	public static void showCurrentTimeAndDate() {
		
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		long totalDays = totalHours / 24;
		
		int currentYear = (int) (totalDays / 365) + 1970;
		long daysInCurrentYear = (totalDays - leapYearDaysSince1970(currentYear)) % 365;
		if (currentHour > 0)
			daysInCurrentYear++;
		
		int monthNumber = getMonthNumber(currentYear, (int) daysInCurrentYear);
		String monthString = getMonthName(monthNumber);
		
		int startDay = getStartDay(currentYear, monthNumber);
		String dayString = getDayOfTheWeekName((int) (startDay + daysInCurrentYear) % 7);
		
		System.out.println("Today is " + dayString + " " + monthString + " " + daysInCurrentYear + ", " + currentYear);
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		
	}
	
	/** Get day of the week name */
	public static String getDayOfTheWeekName (int day) {
		
		String dayOfTheWeekName = "";
		
		switch (day) {
		case 1: dayOfTheWeekName = "Sunday"; break;
		case 2: dayOfTheWeekName = "Monday"; break;
		case 3: dayOfTheWeekName = "Tuesday"; break;
		case 4: dayOfTheWeekName = "Wednesday"; break;
		case 5: dayOfTheWeekName = "Thursday"; break;
		case 6: dayOfTheWeekName = "Friday"; break;
		case 7: dayOfTheWeekName = "Saturday"; break;
		}
		return dayOfTheWeekName;
	}
	
	/** Get day of the month name */
	public static String getMonthName(int month) {
		
		String monthName = "";
		
		switch (month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;
		}
		return monthName;
	}
	
	/** Determine if it is a leap year */
	public static boolean isLeap (int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;	
	}
	
	/** Get number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
			month == 8 || month == 10 ||month == 12)
			return 31;
		
		if (month == 2) return isLeap(year) ? 29 : 28;
		
		return 0;
	}
	
	/** Get total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays (int year, int month) {
		
		int total = 0;
		
		// Get total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++) {
			if (isLeap(i))
				total += 366;
			else 
				total += 365;
		}
		
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}
		return total;	
	}
	
	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month) {
		
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
				
	}
	
	/** Get number of leap years since 1970 */
	public static int leapYearDaysSince1970(int year) {
		
		int count = 0;
		
		for (int i = 1970; i < year; i++)
			if (isLeap(i))
				count++;
		
		return count;
	}
	
	/** Get month number */
	public static int getMonthNumber(int year, int days) {
		
		int dayCounter = 0;
		
		for (int i = 1; i <= 12; i++) {
			
			dayCounter += getNumberOfDaysInMonth(year, i);
			
			if (dayCounter > days)
				return i;	
		}
		return 12;	
	}	
}


