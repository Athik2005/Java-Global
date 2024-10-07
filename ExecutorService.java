import java.util.*;

import java.util.concurrent.*;

class Sample_Class{

	public String ID;

	public double amount;

	public static double total_amount;

	public Sample_Class(String iD, double amount) {

		this.ID = iD;

		this.amount = amount;

	}

	public synchronized void total(double amount) {

		total_amount += amount;
		//System.out.println("CALLED");

	}

}

public class Main{



	public static void main(String[] args) {

		Sample_Class c1;

		ExecutorService ee = Executors.newFixedThreadPool(2);

		List<Sample_Class> list_values = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.print("Enter Transaction ID:");

			String id = sc.next();

			System.out.print("Enter Transaction Amount:");

			double amount = sc.nextDouble();

			c1 = new Sample_Class(id,amount);

			list_values.add(c1);

			System.out.println("Transaction Added Successfully......!");

			System.out.print("Enter Y to Continue & N to Exit : ");

			if(sc.next().equalsIgnoreCase("N"))

				break;

		}

		 list_values.stream()

         .filter(element -> element.amount >= 5000)

         .forEach(element -> {
            
            element.total(element.amount);

         });

		System.out.println("So the Total Amount Above 5000 is "+ Sample_Class.total_amount);

	}



}