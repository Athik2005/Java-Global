package ENCAPSULATION;

public class Main {

	public static void main(String[] args) {
		bankacc b1 = new bankacc("22ISR026",500.0);
		System.out.println(b1);
		b1.deposit(100.0);
		b1.withdrawn(600.0);
		b1.withdrawn(10);
		b1.deposit(-59);
		b1.deposit(300.0);
	}

}
