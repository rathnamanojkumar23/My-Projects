package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of student details to be enrolled : ");
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		Student student[] = new Student[noOfStudents];
		for(int i = 0; i < noOfStudents ; i++) {
			student[i] = new Student();
			student[i].enroll();
			student[i].payTution();
			System.out.println("======================================================");
			System.out.println(student[i].toString());
		}
		sc.close();	
	}

}
