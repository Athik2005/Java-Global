package com.JK;
import java.util.*;
class Vechile {
	int speed;
	public Vechile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed of the vehicle: ");
		this.speed = sc.nextInt();
	}
	void display() {
		System.out.println("Vehicle details from Grand Class: "+speed);
	}
}
class Car extends Vechile{
	String Fuel_Type;
	public Car() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fuel Type of the Vehicle:");
		this.Fuel_Type = sc.next();
	}	
	void display() {
		super.display();
		System.out.println("Car details from Parent Class: "+Fuel_Type);
	}
}
class Electric_Car extends Car{
	String Battery;
	public Electric_Car() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Whether it is Battery Type or not? :");
		this.Battery = sc.next();
	}
	void display() {
		super.display();
		System.out.println("Electric Car details from Children Class: "+Battery);
		System.out.println();
		System.out.println("Displaying All Details from the Children Class");
		System.out.println("Spped Limit: "+speed+"Km/hr \nFuel_Type: "+Fuel_Type+"\nBattery: "+this.Battery);
	}
}
public class multi_test {

	public static void main(String[] args) {
		Electric_Car e1 = new Electric_Car();
		e1.display();
	}

}
