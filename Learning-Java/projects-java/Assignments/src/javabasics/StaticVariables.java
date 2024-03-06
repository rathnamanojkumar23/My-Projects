package javabasics;

public class StaticVariables {
	
	/*
	 * A static variable in java is a variable that belongs to class itself rather than
	 * to any specific instance of the class. This means that there is only one copy of variable in memory
	 * regardless of how many instances of the class are created.
	 */
	static int num;
	
	int num1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVariables.num);
	}

}
