package ch11;

public class CheckingAccount extends Account {
	
	public final double LIMIT = -2000;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (getBalance() - amount < LIMIT) {
			System.out.println("Attempt to overdraw limit, the maximum amount that can be withdrawn is "
								+ (getBalance() - LIMIT));
		} else {
			super.withdraw(amount);;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nOverdraft limit " + LIMIT;
	}

}
