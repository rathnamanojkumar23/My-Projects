package bankaccount;

public class Savings extends Account{
	
	// List properties specific to the Savings Account
	int safetyDepositBoxID ;
	int safetyDepositBoxkey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		//System.out.println("************************************");
		accountNumber = "SV" + accountNumber;
		//System.out.println("ACCOUNT TYPE : SAVINGS ACCOUNT");
		setSafetyDepositBox();
		setRate();
		
	}
	
	public void setRate() {
		rate = (getBaseRate() - .25);
	}
	
	public double getRate() {
		return rate;
	}

	private void setSafetyDepositBox() {
		// TODO Auto-generated method stub
		safetyDepositBoxID =(int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxkey =(int) (Math.random() * Math.pow(10, 3));
		
	}
	
	
	public String showInfo() {
		System.out.println("THE ACCOUNT TYPE : SAVINGS ACCOUNT");
		System.out.println(super.showInfo());
		System.out.println("The features of the Savings Accounts are : ");
		return "SafetyDepositBoxID : " + safetyDepositBoxID + 
				"\nSafetyDepositBoxKey : " +  safetyDepositBoxkey +
				"\nRate : " + rate + "%";
				
		
	}
	
	// list any methods specific to savings account

}
