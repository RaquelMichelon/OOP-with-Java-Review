package digitalBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String name;
	private List<Account> Accounts = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return Accounts;
	}

	public void setAccounts(List<Account> accounts) {
		Accounts = accounts;
	}
	
	public String listClients() {
		StringBuilder sb = new StringBuilder();
		sb.append("Clients List \n");
		for (Account account : Accounts)
		sb.append(account.getClient().getName()).append("\n"); 
		return sb.toString();
	}
	
	public void addAccount(Account account) {
		this.Accounts.add(account);
	}
	

}
