package javabasics;

public class StaticsMethodsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main method");
		StaticsMethodsDemo.method1();

	}
	
	/*
	 * static method:
	 * a method is declared as static, which means that it can be called without
	 * creating an instance of the MyClass class.
	 * 
	 * static methods are often used for utility functions, such as add() method
	 * they also used to access static variables, which are
	 * variables that are shared by all the instances of class
	 */
	
	static void method1() {
		System.out.println("inside the method1");
	}
	
	/**
	 * static block:
	 * A static block is executed first than the main method.
	 * it is a block of code that is executed when the class is loaded into memory.
	 * it is also known as a static initializer block.
	 * they are typically used for initializing static variables,
	 * it can be used to perform any one-time computations or setup operations.
	 */
	static {
		System.out.println("Static Block");
		StaticsMethodsDemo.method1();
	}

}
