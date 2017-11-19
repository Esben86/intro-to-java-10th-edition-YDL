package ch12;
public class Loan {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	private static int numberOfObjectsCreated = 0;
	
	// Default constructor
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	// Construct a loan with specified annual interest rate, number of years and loan amount
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
		numberOfObjectsCreated++;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) 
			throws IllegalArgumentException {

		if (annualInterestRate > 0)
			this.annualInterestRate = annualInterestRate;
		else
			throw new IllegalArgumentException("Interest rate must be greater than 0");
		
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears) 
			throws IllegalArgumentException {
		if (numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else 
			throw new IllegalArgumentException("Years must be greater or equal to zero");
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount > 0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException("The loan amount must be greater than 0");
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	public static int getNumberOfObjectsCreated() {
		return numberOfObjectsCreated;
	}
	
}



