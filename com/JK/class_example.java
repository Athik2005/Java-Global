package com.JK;
import java.util.*;
public class class_example {

	String brand;
	int orders;
	void display() {
		System.out.println("New Brand Added!");
		System.out.println("Brand Name: "+brand+" Number of Orders for that brand is : "+orders);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class_example c;
		while(true) {
			System.out.println("Enter 1 to Insert! ");
			int op = sc.nextInt();
			if(op==1) {
			c = new class_example();
			System.out.println("Enter New Brand: ");
			c.brand = sc.next()+sc.nextLine();
			System.out.println("Enter Number of Orders you need: ");
			c.orders = sc.nextInt();
			c.display();
			}
			else {
				System.out.println("Program is closing......!");
				break;
			}
		}
	}

}
