package bankaccount;

public class Checking extends Account {
	
	// list properties specific to the checking account
	int debitcardNumber;
	int debitcardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		//System.out.println("************************************");
		accountNumber = "CH" + accountNumber;
		//System.out.println("ACCOUNT TYPE : CHECKING ACCOUNT");
		setDebitCard();
		setRate();
		
	}
	public void setRate() {
		rate = (getBaseRate() * (.15));
	}
	
	public double getRate() {
		return rate;
	}

	private void setDebitCard() {
		// TODO Auto-generated method stub
		debitcardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitcardPIN = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	public String showInfo() {
		System.out.println("THE ACCOUNT TYPE : CHECKING ACCOUNT ");
		System.out.println(super.showInfo());
		System.out.println("The Features of the Checking Account : ");
		return "DebitCard Number : " + debitcardNumber +
			   "\nDebitCard PIN : " + debitcardPIN +
			   "\nInterest Base Rate : " + rate +"%";
	}
	
	
	//  list any methods specific to the checking account

}
