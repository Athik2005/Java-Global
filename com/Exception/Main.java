package com.Exception;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		/*try {
			b1.deposit(100.0);
			System.out.println("Deposit Successfull"+"\n Balance : "+b1.getBalance());
			b1.withdrawn(600.0);
			System.out.println("Withdrawn Successfull"+"\n Balance : "+b1.getBalance());
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error : "+e.getMessage());
			System.out.println("Withdrawn Failed!"+"\n Balance : "+b1.getBalance());
		}
		finally {
			System.out.println("Done1!\n");
		}
		try {
			b1.withdrawn(10);
			System.out.println("Withdrawn Successfull"+"\n Balance : "+b1.getBalance());
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error : "+e.getMessage());
			System.out.println("Withdrawn Failed!"+"\n Balance : "+b1.getBalance());
		}
		finally {
			System.out.println("Done2!\n");
		}
		try {
			b1.deposit(-59);
			System.out.println("Deposit Successfull"+"\n Balance : "+b1.getBalance());
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error : "+e.getMessage());
			System.out.println("Deposit Failed!"+"\n Balance : "+b1.getBalance());
		}
		finally {
			System.out.println("Done3!\n");
		}
		try {
			b1.deposit(300.0);
			System.out.println("Deposit Successfull"+"\n Balance : "+b1.getBalance());
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error : "+e.getMessage());
		}
		finally {
			System.out.println("Done4!\n");
		}*/
		Scanner sc = new Scanner(System.in);
		int opt;
		System.out.println("Enter Card Holder Name:");
		String name = sc.next();
		System.out.println("Enter New Balance:");
		double amt = sc.nextDouble();
		bankacc b1 = new bankacc(name,amt);
		System.out.println(b1);
		while(true) {
			System.out.println("\n1.Deposit\n2.WithDraw\n3.Balance\nEnter Options:");
			opt = sc.nextInt();
			if(opt==1) {
				try {
					System.out.println("Amount:");
					amt = sc.nextInt();
					b1.deposit(amt);
					System.out.println("Deposit Successfull"+"\n Balance : "+b1.getBalance());
				}
				catch(InsufficientBalanceException e) {
					System.out.println("Error : "+e.getMessage());
				}
			}
			else if(opt==2) {
				try {
					System.out.println("Amount:");
					amt = sc.nextInt();
					b1.withdrawn(amt);
					System.out.println("Withdrawn Failed!"+"\n Balance : "+b1.getBalance());
				}
				catch(InsufficientBalanceException e) {
					System.out.println("Error : "+e.getMessage());
					System.out.println("Withdrawn Failed!"+"\n Balance : "+b1.getBalance());
				}
			}
			else if(opt==3)
				System.out.println(b1);
			else {
				System.out.println("Thankyou!");
				break;
			}
		}
	}
}
