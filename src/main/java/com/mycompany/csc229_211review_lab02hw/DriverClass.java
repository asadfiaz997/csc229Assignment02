package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner   //input scanner class to take input from user
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		
		 // Student object
		Student std1= new Student("James", 20);
		
		// GPA input from user
      //Create a Scanner object to read input from user
		Scanner sc = new Scanner(System.in);
		
		//Ask the user to enter GPA for student
		System.out.print("Enter GPA for the student: ");

		// Read the GPA entered by the user and store it in a variable
        double gpa = sc.nextDouble();

		// Set the GPA value for the student object
        std1.setGpa(gpa);

		// Print student information (toString method will be called automatically)
		System.out.println(std1);
		
		sc.close();
		
	}

}
