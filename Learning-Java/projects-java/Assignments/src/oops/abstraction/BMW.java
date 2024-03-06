package oops.abstraction;

public abstract class BMW {
	
	void commonfunc() {
		System.out.println("inside common functionality");
		int javaVersion = 8;
		String kohli = "king kohli";
		String message =  String.format("nothing to add to grid property ; jdk version: %s; jdk 17 property list content : %s", javaVersion, kohli);
		System.out.println(message);
	}
	
	
	abstract void accelerate();
}
