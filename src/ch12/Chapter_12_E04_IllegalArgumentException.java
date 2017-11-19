package ch12;

public class Chapter_12_E04_IllegalArgumentException {

	public static void main(String[] args) {
		
		try {
			Loan loan1 = new Loan();
			Loan loan2 = new Loan(5, 5, -20000);
			
		} 
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println(Loan.getNumberOfObjectsCreated());

	}

}
