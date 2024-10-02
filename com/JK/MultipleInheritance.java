package com.JK;
interface MSG{
	void sendmsg();
}
interface POST{
	void putpost();
}
class INSTA implements MSG,POST{
	public void sendmsg() {
		System.out.println("Sending Message!");
	}
	public void putpost() {
		System.out.println("Posting New Images!");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		INSTA it = new INSTA();
		it.sendmsg();
		it.putpost();
		
	}
}
