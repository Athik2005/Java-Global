package TYPES_OF_STREAM;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
class Product{
	String name;
	double amount;
	double after_dis;
	public Product(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
		this.after_dis = amount;
	}
	public void apply_discount(int per) {
		this.after_dis = this.after_dis-(this.after_dis * per)/100;
		this.amount = this.after_dis;
	}
	@Override
	public String toString() {
		return "Product [ Name " + name + ", Amount " + amount + "]";
	}
	
}
public class task_1 {

	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter Name : ");
			String name = sc.next();
			System.out.print("Enter the Price : ");
			double price = sc.nextDouble();
			p1.add(new Product(name,price));
			System.out.println("Product Added!");
			System.out.print("Enter 1 to Exit : ");
			int opt = sc.nextInt();
			if(opt == 1)
				break;
		}
		System.out.println("Products so far Added without discount");
		System.out.println(p1);
		System.out.println("Enter Discount Value: ");
		int per = sc.nextInt();
		//List<Double> ans = p1.stream().map( value -> value.after_dis - (value.after_dis * per)/100).collect(Collectors.toList());
		p1.stream().forEach( value -> value.apply_discount(per));
		System.out.println("Products after discount");
		System.out.println(p1);
		sc.close();
	}

}
