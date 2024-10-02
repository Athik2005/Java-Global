package com.ABSTRACT;
abstract class Motor_Bike{
	abstract public void apply_brake();
	public void display_func() {
		System.out.println("Motor Bike Starts!");
	}
}
class SportsBike extends Motor_Bike{
	public void apply_brake() {
		System.out.println("\nApplying Brakes for Sports Bike.........!");
	}
	public void display_func() {
		System.out.println("\nSports Bike Starts!");
	}
}
class Mountain_Bike extends Motor_Bike{
	public void apply_brake() {
		System.out.println("\nApplying Brakes for Mountain Bike.........!");
	}
	public void display_func() {
		System.out.println("\nMountain Bike Starts!");
	}
}
public class abstract_prgm {
	public static void main(String[] args) {
		Motor_Bike sb = new SportsBike();
		Motor_Bike mb = new Mountain_Bike();
		sb.display_func();
		mb.display_func();
		sb.apply_brake();
		mb.apply_brake();
		
	}

}
