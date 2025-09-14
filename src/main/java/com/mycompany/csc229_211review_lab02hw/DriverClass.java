package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;   // Import Scanner class to take input from the user

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		
		Student std1= new Student("James", 20);
		
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Ask the user to enter GPA for the student
		System.out.print("Enter GPA for the student: ");
		
		// Read the GPA entered by the user and store it in a variable
		double gpa = sc.nextDouble();
		
		// Set the GPA value for the student object
		  std1.setGpa(gpa);
		
		
		System.out.println(std1);
		
			sc.close();
	}

}
