package javabasics;

public class NonStaticMembersDemo {
	
	int num;
	
	/*
	 * Non Static block:
	 * this is a class level block that executes logic whenever an object is created.
	 * The JVM automatically call the non static blocks when an object is created.
	 * This blocks can directly access static and instance variables.
	 */
	NonStaticMembersDemo(){
		System.out.println("Inside the constructor");	
	}
	
	static {
		System.out.println("inside the static block");
	}
	
	{
		System.out.println("inside the non-static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the main method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}

}
