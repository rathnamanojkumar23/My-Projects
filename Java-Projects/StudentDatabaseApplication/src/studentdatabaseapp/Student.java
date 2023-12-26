package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance=0;
	private int costOfCourse = 600;
	private int id = 1000;
	
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		System.out.print("Enter the First Name of the Student : ");
		this.firstName = sc.next();
		System.out.print("Enter the Last Name of the Student : ");
		this.lastName = sc.next();
		System.out.println("The Following are the Student Grade Year : \n1.Fresher \n2.Sophomore \n3.Junior \n4.Senior");
		System.out.print("Please choose your Grade Year : ");
		this.gradeYear = sc.nextInt();
		setStudentID();
		getStudentID();
		
	}
	
	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	public String getStudentID() {
		return this.studentId;
	}
	
	public void enroll() {
		System.out.println("The available courses to enroll are : \n1. History : 101 \n2. Mathematics : 101 \n3. English : 101 \n4. Chemistry : 101 \n5. Computer Science : 101 ");
		do {
			System.out.print("Enter the courses to enroll , if not enter Q (for quit) : ");
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance =  tuitionBalance + costOfCourse;	
			}
			else {
				break;
			}
		}while(1 != 0);
		System.out.println("TUTUION BALANCE " + tuitionBalance);
		
	}
	
	public void viewBalance() {
		System.out.println("Your Balance is $"+tuitionBalance);
	}
	
	public void payTution() {
		viewBalance();
		System.out.print("Enter your payment : $");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance-payment;
		System.out.println("Thank you for the payment of $"+payment);
		viewBalance();

	}
	
	public String toString() {
		return "Name : " + firstName + " " + lastName +
				"\nGrade year : " + gradeYear +
				"\nStudent ID : " + studentId +
				"\nCourses Enrolled : " + courses +
				"\nBalance : $" + tuitionBalance;
	}
}
