package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Person
public class Student extends Person {

	// GPA field (to store student's GPA)
	private double gpa;
    private String address;

	//Constructor for Student class
	 public Student(String name, int age) {
        super(name, (short) age);  // parent constructor call
    }

	 // Getter & Setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
	
	
	 @Override
    public String getAddress() {
        return address; 
    }
	
	 @Override
    public void setAddress() {
        this.address = address; 
    }

	// toString method  Automatically called when we print the Student object
	 @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
    }

}
