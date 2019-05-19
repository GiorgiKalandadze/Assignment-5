package Package1;

public class Account {
	private String username;
	private String password;
	
	/**
	 * Constructor
	 */
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Method that returns account's username
	 */
	public String getusername() {
		return this.username;
	}
	
	/**
	 * Method that returns account's password
	 */
	public String getPassword() {
		return this.password;
	}
}
