package javabasics;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
	}
	
	/**
	 * static block:
	 * it is a block of code that is executed when the class is loaded into memory.
	 * it is also known as a static initializer block.
	 * they are typically used for initializing static variables,
	 * it can be used to perform any one-time computations or setup operations.
	 */
	static {
		System.out.println("Static Block");
	}
	

}
