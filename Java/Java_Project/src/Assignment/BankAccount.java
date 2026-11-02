package Assignment;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	protected double balance;
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		return balance=balance+amount;
	}
	public double withdraw(double amount) {
		return  balance=balance-amount;
	}
	
	public void display() {
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account Holder name : " + accountHolderName);
		System.out.println("Account Balance : " + balance);
	}
	
	
}
