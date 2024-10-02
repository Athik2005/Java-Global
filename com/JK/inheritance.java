package com.JK;

class Main {
	String name;
	int age;
	double salary;
	Main(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	void display() {
		System.out.println("Name : "+name+" Age : "+age);
	}
}
class derived_class extends Main{
	String branch;
	derived_class(String name,int age,double salary,String branch){
		super(name,age,salary);
		this.branch = branch;
	}
	void display() {
		super.display();
		System.out.println("Salary : "+salary+" Branch : "+this.branch);
	}
}

public class inheritance{
	public static void main(String[] args) {
		derived_class d1 = new derived_class("Athik",20,50000,"MSc");
		d1.display();
	}
}