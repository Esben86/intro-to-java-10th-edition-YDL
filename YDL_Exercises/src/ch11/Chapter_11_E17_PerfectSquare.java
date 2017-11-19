package ch11;
import java.util.Scanner;
import java.util.ArrayList;

public class Chapter_11_E17_PerfectSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter an integer m: ");
		int m = input.nextInt();
		int n = 1;
		
		ArrayList<Integer> factors = getFactors(m);
		
		Integer[][] counts = getCounts(factors);
				
		for (int i = 0; i < counts.length; i++) {
			if (counts[i][1] % 2 != 0) 
				n *= counts[i][0];		
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is "
							+ n + "\nm * n is " + m * n);	
	}
	
	public static ArrayList<Integer> getFactors(int m) {
		
		ArrayList<Integer> factors = new ArrayList<>();
		int divisor = 2;
		
		while (m > 1) {
			if (m % divisor == 0) {
				factors.add(divisor);
				m /= divisor;
			} else {
				divisor++;
			}
		}
		return factors;
	}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		
		ArrayList<Integer> unique = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if (!unique.contains(list.get(i)))
				unique.add(list.get(i));
		}	
		return unique;
	}
	
	public static Integer[][] getCounts(ArrayList<Integer> factors) {
		
		ArrayList<Integer> unique = removeDuplicates(factors);
		
		Integer[][] counts = new Integer[unique.size()][2];
		
		for (int i = 0; i < counts.length; i++) {
			
			int count = 0;
			counts[i][0] = unique.get(i);
			
			for (int j = 0; j < factors.size(); j++) {
				
				if (unique.get(i) == factors.get(j))
					count++;	
			}
			counts[i][1] = count;
		}
		return counts;
	}
	
}
