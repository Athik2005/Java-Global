package com.JK;
class Calculator{
	int a,b,c=0;
	double e,f;
	/*Constructor Overloading*/
	Calculator(){
	}
	Calculator(int a,int b){
		this.a = a;
		this.b = b;
		Calculator c = new Calculator();
		c.add();
	}
	Calculator(double a,double b){
		this.e = a;
		this.f = b;
		Calculator c = new Calculator();
		c.add();
	}
	Calculator(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
		Calculator D = new Calculator();
		D.add();
	}
	public void add() {
		System.out.println(a+b+c);
	}

}
public class POLY {
	public static void main() {
		Calculator c1 = new Calculator(10,20);
		c1.add();
		Calculator c2 = new Calculator(10,20,30);
		c2.add();
		Calculator c3 = new Calculator(10.5,20.4);
		c3.add();
	}
}
