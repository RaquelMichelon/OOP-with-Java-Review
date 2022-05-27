package digitalBank;

public abstract class Account implements IAccount {
	
	private static final int PATTERN_AGENCY = 1;
	private static int SEQUENCE = 1;
		
	protected int agency;
	protected int number;
	protected double balance;
	
	protected Client client;
	
	protected Bank bank;
	
	public Account(Client client) {
		this.agency = Account.PATTERN_AGENCY;
		this.number = SEQUENCE++;
		this.client = client;
	}
	
	@Override
	public void withdraw(double value) {
		balance -= value;
	}
	
	@Override
	public void deposit(double value) {
		balance += value;
	}
	
	@Override
	public void transfer(double value, Account destinyAccount) {
		this.withdraw(value);
		destinyAccount.deposit(value);
	}
	
	protected void printAccountInfo() {
		System.out.println(String.format("Client: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}

	public int getAgency() {
		return agency;
	}


	public int getNumber() {
		return number;
	}


	public double getBalance() {
		return balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	

}
