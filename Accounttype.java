package scratch;

public class Accounttype implements BankAcc {
    double initialBalance;
	double totalBalance;
	double rateOfInterest = 5 ; 
	@Override	
	public void deposit(double amount) {
		totalBalance = initialBalance+ amount;
	}
	@Override
	public void withdraw(double amount) {
		totalBalance = totalBalance - amount;
	}
	@Override
	public double checkBalance() {
		return totalBalance;
	}

}
