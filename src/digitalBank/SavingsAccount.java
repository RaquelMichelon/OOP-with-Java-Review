package digitalBank;

public class SavingsAccount extends Account {

	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printResume() {
		System.out.println("--- Saving Account Resume ---");
		super.printAccountInfo();
	}

}
