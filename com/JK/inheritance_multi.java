package com.JK;
class Main_1 {
	String RegNo;
	public Main_1(String regNo) {
		super();
		this.RegNo = regNo;
	}
	void display() {
		System.out.println("Register Number details from Grand Class: "+RegNo);
	}
}
class Dept extends Main_1{
	String Department;
	public Dept(String regNo,String Department) {
		super(regNo);
		this.Department = Department;
	}	
	void display() {
		super.display();
		System.out.println("Department details from Parent Class: "+Department);
	}
}
class Year_Of_Study extends Dept{
	int year;
	public Year_Of_Study(String regNo, String Department,int year) {
		super(regNo, Department);
		this.year = year;
	}
	void display() {
		super.display();
		System.out.println("Year of Study details from Children Class: "+year+"rd");
		System.out.println();
		System.out.println("Displaying All Details from the Children Class");
		System.out.println("Register Number: "+RegNo+"\nDepartment: "+Department+"\nYear of Study: "+this.year+"rd");
	}
}
public class inheritance_multi{
	public static void main(String[] args) {
		Year_Of_Study y1 = new Year_Of_Study("22ISR026","MSc Software Systems",3);
		y1.display();
	}
}