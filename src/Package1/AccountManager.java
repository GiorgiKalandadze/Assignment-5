package Package1;

import java.util.*; 
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;


public class AccountManager {
    private static AccountManager accountManager;
    private AccountDTO accountDTO;
    
    /**
     * Constructor
     */
    public AccountManager() {
    	accountDTO = new AccountDTO();
    }
    
    public static AccountManager getInstance(){
        if (accountManager == null){
            synchronized (AccountManager.class){
                if (accountManager == null){
                    accountManager = new AccountManager();
                }
            }
        }
        return accountManager;
    }
    
    /**
     * Method that allow us to check if an there is an account with given userName
     */
    public boolean accountExist(String userName) {
    	if(accountDTO.getAccount(userName) == null) {
    		return false;
    	}
    	return true;
    			
    }
    
    /**
     * return null if account with the given username doesn't exist or
     * password is incorrect
     */
    public Account loginUser(String username, String password){
         Account account = accountDTO.getAccount(username);
         if (account != null){
             if (account.getPassword().equals(password)){
                 return account;
             }
         }
         return null;
    }

    /**
     * return false if account with the given username already exists
     */
    public boolean registerUser(String username, String password){
        if (accountExist(username)){
            return false;
        }else {
            Account newAccount = new Account(username, password);
            accountDTO.addAccount(newAccount);
            return true;
        }
    }
    
    
    public static void main(String[] args) {
    	AccountManager am = new AccountManager();
    	System.out.println(am.accountExist("Patrick"));
    	System.out.println(am.accountExist("Molly"));
    	System.out.println(am.accountExist("Giorgi"));
    	am.registerUser("Giorgi", "24");
    	System.out.println(am.accountExist("Giorgi"));
    	
    }
	
}
