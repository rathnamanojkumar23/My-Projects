package bankaccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accounts = new LinkedList<Account>();
		String file = "C:\\M_WORKSPACE\\My-Projects\\Java-Projects\\BankApplication\\src\\resources\\NewBankAccounts.csv";
		
		
//		Checking checkacc1 = new Checking("Manoj","CH3457489",1200);
//		System.out.println(checkacc1.showInfo());
//		Savings savingacc = new Savings("Ranadheer", "SV3209470", 5000);
//		System.out.println(savingacc.showInfo());
		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolder;
		newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSN,initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		for (Account acc: accounts) {
			System.out.println();
			System.out.println("*****************************************************");
			System.out.println(acc.showInfo());
		}
	}

}
