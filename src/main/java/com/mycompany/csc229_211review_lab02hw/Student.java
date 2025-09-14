package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Person
public class Student extends Person {
	//to inherit the class we use extend
	
	private double gpa;
	private String address;
	
	public Student(String name , int age){
       super(name , (short) age);
	}

	// ToDo 3: Add a field for GPA and create setter and getter
	public double getGpa(){
      return gpa;
	}

	public void setGpa(double gpa){
     this.gpa = gpa;
	}

	 // Required methods from Person 
    @Override
    public String getAddress() {
        return address;

    @Override
    public void setAddress(String address) {
         this.address = address;
    }

    //  toString method
    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
    }

}
