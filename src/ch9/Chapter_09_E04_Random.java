package ch9;
import java.util.Random;

public class Chapter_09_E04_Random {

	public static void main(String[] args) {
		
		Random r = new Random(1000);
				
		for (int i = 0; i <= 100; i++) {
			System.out.print(((i + 1) % 10 != 0) ? r.nextInt(49) + " " : r.nextInt(49) + "\n");
			
		}

	}

}
