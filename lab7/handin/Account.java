//Amanda Nguyen Problem 4 ATM Banking
public class Account{
	private static int count = 0;

	private String name;
	private String pin;
	private int id;
	private double balance;

	public Account(String name, String pin){
		this.name = name;
		this.pin = pin;
		this.id = Account.count++;
		this.balance = 0.0;

	} public String getName(){
		return this.name;

	} public int getID(){
		return this.id;

	}public double getBalance(){
		return this.balance;

	} public boolean isPin(String attempt){
		boolean isValid = attempt.equals(this.pin);
		return isValid;

	}public void deposit(double money){
		if (money >= 0)
			this.balance += money;

	}public void withdraw(double money){
		if (money >= 0 && this.balance >= money)
			this.balance -= money;

	}public String toString() {
		return String.format("Name: %s, Account ID: %d, Balance: $%.02f", 
														this.name, this.id, this.balance);
	}


}