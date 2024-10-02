package com.JK;
import java.util.*;
class Principal{
	String time;
	String name;
}
class Student extends Principal{
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your Name: ");
		name = sc.next();
		System.out.println("Enter the Your IN Time: ");
		time = sc.next();
	}
	void display() {
		System.out.println("Name: "+name+"\nIN Time: "+time);
	}
}
class HOD extends Principal{
	HOD(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your Name: ");
		name = sc.next();
		System.out.println("Enter the Your IN Time: ");
		time = sc.next();
	}
	void display() {
		System.out.println("Name: "+name+"\nIN Time: "+time);
	}
}
class Professor extends Principal{
	Professor(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your Name: ");
		name = sc.next();
		System.out.println("Enter the Your IN Time: ");
		time = sc.next();
	}
	void display() {
		System.out.println("Name: "+name+"\nIN Time: "+time);
	}
}
public class hierarchical {

	public static void main(String[] args) {
		System.out.println("Student Details");
		Student s1 = new Student();
		s1.display();
		System.out.println("HOD Details");
		HOD s2 = new HOD();
		s2.display();
		System.out.println("Professor Details");
		Professor s3 = new Professor();
		s3.display();
	}

}
