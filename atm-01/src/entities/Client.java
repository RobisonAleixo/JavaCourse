package entities;

public class Client {
	private int accountNumber;
	private String name;
	private double balance;

	public Client(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(balance);
		;
	}

	public Client(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
		else
			System.out.println("Value must be greater than zero!\n");
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount > balance)
				System.out.println("Insufficient funds\n");
			else
				balance -= (amount + 5);
		} else {
			System.out.println("Value must be greater than zero!\n");
		}
	}

	public String toString () { 
		return "Account " + accountNumber 
				+ ", Holder: " + name 
				+ ", Balance: $ " + String.format("%.2f", balance);

	}

}
