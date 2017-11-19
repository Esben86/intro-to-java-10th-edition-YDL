package ch10;

public class Chapter_10_E14_TestMyDate {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(43455555133101L);
		
		System.out.println(date1.getDay() + " / " + date1.getMonth() + " / " + date1.getYear());
		System.out.println(date2.getDay() + " / " + date2.getMonth() + " / " + date2.getYear());

	}

}
