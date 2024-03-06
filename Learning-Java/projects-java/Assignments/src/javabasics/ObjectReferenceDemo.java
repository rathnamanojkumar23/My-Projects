package javabasics;

public class ObjectReferenceDemo {
	
	ObjectReferenceDemo(int num){
		System.out.println(num);
	}
	
	public static void main(String args[]) {
		System.out.println("inside main");
		ObjectReferenceDemo ob1 = new ObjectReferenceDemo(1);
		ObjectReferenceDemo ob2 = new ObjectReferenceDemo(2);
	}

}
