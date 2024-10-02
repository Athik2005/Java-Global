package com.Exception;
public class exception_prgm {

	public static void main(String[] args) {
		try {
			int a = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Arithmetic Operation Performed Successfully....!\n");
		}
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getStackTrace());
		}
		finally {
			System.out.println("String Length Finding Operation Performed Successfully....!\n");
		}
		try {
			int[] a = {1,2,3};
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//e.getStackTrace();
		}
		finally {
			System.out.println("Accessing of Array Operation Performed Successfully....!\n");
		}
		try {
			String num = "abc";
			int n = Integer.parseInt(num);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		//	e.getStackTrace();
		}
		finally {
			System.out.println("String to Integer Operation Performed Successfully....!\n");
		}
		try {
			Object o1 = "hello";
			Integer num = (Integer)o1;
		}
		catch(ClassCastException e) {
			System.out.println(e.getMessage());
			//e.getStackTrace();
		}
		finally {
			System.out.println("Object to Integer Operation Performed Successfully....!\n");
		}
		try {
			String s1 = "hello";
			System.out.println(s1.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//e.getStackTrace();
		}
		finally {
			System.out.println("String Accessing Operation Performed Successfully....!");
		}
	}

}
