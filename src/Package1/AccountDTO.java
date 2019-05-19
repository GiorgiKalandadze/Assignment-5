package Package1;

import java.util.HashMap;
import java.util.Map;

public class AccountDTO {
	private static Map<String, Account> base = new HashMap<>();
	
	public Account getAccount(String userName) {
		return base.get(userName);
	}
	
	public void addAccount(Account account) {
		base.put(account.getusername(), account);
	}
	
	 static {
		 base.put("Patrick", new Account("Patrick", "1234"));
		 base.put("Molly", new Account("Patrick", "FloPup"));
	    }
}
