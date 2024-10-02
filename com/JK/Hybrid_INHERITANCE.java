package com.JK;

class A{
	void display() {
		System.out.println("CLASS A");
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("CLASS B");
	}
}
class C extends B{
	void display() {
		super.display();
		System.out.println("CLASS C");
	}
}
class D extends C{
	void display() {
		super.display();
		System.out.println("CLASS D");
	}
}
class E extends C{
	void display() {
		super.display();
		System.out.println("CLASS E");
	}
}
public class Hybrid_INHERITANCE {

	public static void main(String[] args) {
		D d1 = new D();
		d1.display();
		
		System.out.println();
		E e1 = new E();
		e1.display();
	}

}
