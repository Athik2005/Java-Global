package com.JK_1;
import java.util.*;
public class ADD {
	static int ins = 20;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ADD_1 a_1 = new ADD_1();
		System.out.println("Enter num 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter num 2: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addtion is :" + c);
		//ADD m = new ADD();
		//System.out.println(m.ins);
		a_1.display();
	}
}
class ADD_1 {
	//static int ins = 20;
	public void display() {
		System.out.println(ADD.ins);
	}
}
