package ENCAPSULATION;

public class bankacc {
	private String CardHandlerName;
	private double balance;
	bankacc(String CardHandlerName,double balance){
		this.balance = balance;
		this.CardHandlerName = CardHandlerName;
	}
	public String getCardHandlerName() {
		return this.CardHandlerName;
	}
	public double getBalance() {
		return this.balance;
	}
	public void withdrawn(double amount) {
		if(amount>0 && amount<=this.balance) {
			this.balance -= amount;
			System.out.println(amount+" Withdrawn "+" from "+this.CardHandlerName+" and New Balance is : "+this.balance);
		}
		else {
			System.out.println("Failed to Withdraw");
		}
	}
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
			System.out.println(amount+" Deposited! "+" in "+this.CardHandlerName+" and New Balance is : "+this.balance);
		}
		else {
			System.out.println("Failed to Deposit!");
		}
	}
	@Override
	public String toString() {
		return "Card Handler Name is : " + CardHandlerName + "\nBalance is : " + balance+"\n";
	}
	
	
}
