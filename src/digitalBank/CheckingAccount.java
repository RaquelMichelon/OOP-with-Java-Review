package digitalBank;

public class CheckingAccount extends Account {

	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public void printResume() {
		System.out.println("--- Checking Account Resume ---");
		super.printAccountInfo();
	}

}
