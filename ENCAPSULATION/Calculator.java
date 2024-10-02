package ENCAPSULATION;

public class Calculator {
	private int num1=0;
	public int getNum1() {
		return num1;
	}
	public void increment() {
		this.num1 += 1;
		System.out.println("Increment successfully!");
		System.out.println("Value : "+this.num1);
	}
	public void decrement() {
		this.num1 -= 1;
		System.out.println("Decrement successfully!");
		System.out.println("Value : "+this.num1);
	}
	public void reset() {
		this.num1 = 0;
		System.out.println("Reset successfully!");
		System.out.println("Value : "+this.num1);
	}
	
}
