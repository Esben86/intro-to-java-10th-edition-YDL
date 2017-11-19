package ch12;

public class Chapter_12_E10_OutOfMemoryError {

	public static void main(String[] args) {
		
		int size = 24;
		
		try {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				size *= 2;
				int[] array = new int[size];
				System.out.println("Array size is now " + size);
			}
			
			
		}
		catch (OutOfMemoryError ex) {
			ex.printStackTrace();
		}
	}

}
