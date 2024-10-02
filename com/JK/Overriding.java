package com.JK;
class Z_1{
	public void sound() {
		System.out.println("Class A");
	}
}
class Y extends Z_1{
	public void sound() {
		System.out.println("Class B");
	}
}
class X extends Z_1{
	public void sound() {
		System.out.println("Class C");	
	}
}
public class Overriding {
	public static void main(String[] args) {
		Z_1 a1 = new Y();
		Z_1 a2 = new X();
		a1.sound();
		a2.sound();
	}
}
