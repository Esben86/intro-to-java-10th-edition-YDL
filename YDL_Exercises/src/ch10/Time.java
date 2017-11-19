package ch10;

public class Time {
	
	public static void main(String[] args) {
		
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		
		System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
		System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

	}
	
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		long time = System.currentTimeMillis() / 1000;
		this.second = (int) time % 60;
		this.minute = (int) (time / 60) % 60;
		this.hour = (int) (time / 3600) % 24;	
	}
	
	public Time(long elapsedTime) {
		long time = (System.currentTimeMillis() / 1000) + elapsedTime;
		this.second = (int) time % 60;
		this.minute = (int) (time / 60) % 60;
		this.hour = (int) (time / 3600) % 24;	
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapsedTime) {
		long time = (System.currentTimeMillis() / 1000) + elapsedTime;
		this.second = (int) time % 60;
		this.minute = (int) (time / 60) % 60;
		this.hour = (int) (time / 3600) % 24;
	}

}
