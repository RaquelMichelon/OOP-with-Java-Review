package digitalBank;

public class Main {
	
	public static void main(String[] args) {
		
		Client cl = new Client();
		cl.setName("Rachel Green");
		
		
		Account check = new CheckingAccount(cl);
		Account save = new SavingsAccount(cl);
		
		check.deposit(100.00);
		check.transfer(100.00, save);
		
		check.printResume();		
		save.printResume();
		
		Bank bank = new Bank();
		bank.setName("Best Bank");
		bank.addAccount(save);
		bank.addAccount(check);
		
		System.out.print(bank.listClients().toString());
	}

}
