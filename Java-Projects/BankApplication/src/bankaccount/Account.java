package bankaccount;

public abstract class Account implements IBaseRate{
	// list common properties for savings and checking accounts
	String accountHolderName;
	String sSN;
	String branchName;
	String branchCode;
	double balance;
	static int index = 10000; 
	String accountNumber;
	double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String accountHoldername, String sSN, double initDeposit) {
		this.accountHolderName = accountHoldername;
		this.sSN = sSN;
		balance = initDeposit;
		this.accountNumber = setAccountNumber();
		
	}
	public void deposit(double amount) {
		balance = balance + amount;
		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void transfer (String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		
	}
	
	private String setAccountNumber() {
		String lasttwoOfSSN = (String) sSN.subSequence(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int random3diNumber = (int) (Math.random() * Math.pow(10, 3));
		return lasttwoOfSSN+uniqueID+random3diNumber;
	}
	
	public String showInfo() {
		return "Name of the Account Holder : " + accountHolderName + 
				"\nSSN Number : " + sSN +
				"\nAccount Number :" + accountNumber +
				"\nBalance : " + balance;
				
	}
	
	// list common methods

}
