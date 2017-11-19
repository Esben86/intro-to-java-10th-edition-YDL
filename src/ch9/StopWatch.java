package ch9;

public class StopWatch {

	private long startTime = 0;
	private long endTime = 0;
	
	public StopWatch(){
		startTime = System.currentTimeMillis();
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public long getEndTime(){
		return endTime;
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	
}
