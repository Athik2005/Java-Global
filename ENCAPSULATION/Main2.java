package ENCAPSULATION;
import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		Calculator c = new Calculator();
		while(true) {
			System.out.println("\n1.Increment\n2.Decrement\n3.Reset\n4.Display\nEnter Options:");
			opt = sc.nextInt();
			if(opt==1)
				c.increment();
			else if(opt==2)
				c.decrement();
			else if(opt==3)
				c.reset();
			else if(opt==4)
				System.out.println("Value : "+c.getNum1());
			else
				break;
		}
	}
}
