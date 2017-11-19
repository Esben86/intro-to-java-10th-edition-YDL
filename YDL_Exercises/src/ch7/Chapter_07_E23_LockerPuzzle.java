package ch7;

public class Chapter_07_E23_LockerPuzzle {

	public static void main(String[] args) {
		
		boolean[] lockers = new boolean[101];
						
		for (int i = 1; i < lockers.length; i++) {
			for (int j = i; j < lockers.length; j += i) {
				lockers[j] = !lockers[j];
			}
		}
				
		for (int i = 1; i < lockers.length; i++) 
			System.out.print("Locker nr " + i + " is" + ((lockers[i]) ? " open\n" : " closed\n"));
	}

}
