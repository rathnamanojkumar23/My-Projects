/**
 * 
 */
package emailapp;

import java.util.Scanner;

/**
 * @author r.m.k.reddy
 *
 */
public class Email {
	
	 /**
	  *  reason for using private infront the variable
	  *  1. Encapsulation:
	  *     Private variables can only be accessed by methods of the same class. 
	  *     This helps to keep the data within the class organized and secure.
	  *     
	  *  2. Data hiding:
	  *  	Private variables hide the internal implementation details of the class from other classes. 
	  *  	This makes the code more modular and easier to maintain.
	  *  
	  *  3. Control over access:
	  *  	Private variables allow us to control how other classes can access the data. For example, we can provide public methods that allow other classes to read the data, but not write to it.
	  *  	This can help to prevent errors and ensure that the data is always in a valid state.
	  *  
	  */
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String emailId;
	private int mailboxCapacity = 100;
	private int defaultPasswordLength = 12;
	private String company = "MKGroup";
	private String alternateEmail;
	
	/**
	 * Constructor:
	 * Constructor in java is used to create the instance of the class.
	 * A constructor is used to assign values to variables when creating an object
	 * 
	 * this keyword:
	 * this keyword in Java is a reference variable that refers to the current object of a method or a constructor.
	 * The main purpose of using this keyword in Java is to remove the confusion between class attributes and parameters that have same names.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("Name of the employee : ");
		System.out.println(this.firstName + " " + this.lastName);
		department = setDepartment();
		System.out.println("Employee is given the department : " + department);
		emailId = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department.toLowerCase()+"."+company.toLowerCase()+"."+"com";
		System.out.println("Employee office emailId is : " + emailId);
		password = setRandomPassword(defaultPasswordLength);
		System.out.println("Employee password is : " + password);
		
	}
	
	/**
	 * Setter methods are a powerful tool that can be used to control access to data,
	 * validate data, and perform other actions when data is changed.
	 * To control access to private data.
	 * To validate data before it is stored.
	 * To perform logging or other actions when data is changed.
	 * To provide a consistent way to update data, even if the data is accessed from multiple methods.
	 * 
	 * @return
	 */
	// Ask for the department
	private String setDepartment() {
		System.out.println("IT team has to decide the department as per the choice : \n 1. Sales \n 2. Development \n 3. Accounting \n 4. No Dept");
		System.out.print("The department choice : " );
		int deptChoice = (int) (Math.random() * 4);
		switch(deptChoice) {
		case 1:
			department = "Sales";
			break;
		case 2:
			department = "Dev";
			break;
		case 3:
			department = "Accounts";
			break;
		default:
			return "None";
			
		}
		return department;
		
	}
	
	// Generate a random password
	private String setRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		char password[] = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	// set the mailbox capacity
	public void setMailBoxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	// set the alternative Email
	public void setAlternativeEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// change the password
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxcapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternativeEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("These are the details of the Employee : ");
		return " Display Name : " + firstName + " " + lastName + 
				"\n EmilId :" + emailId +
				"\n Alternative EmailId : " + getAlternativeEmail();
		
		
	}

}
