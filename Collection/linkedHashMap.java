package Collection;
import java.util.*;
class Amazon{
	//private String prd_name;
	private double cost;
	private int quantity;
	public Amazon(double cost,int quantity) {
		this.cost = cost;
		this.quantity = quantity;
	}
	public double getAmt() {
		return this.cost;
	}
	public int getQuantity() {
		return this.quantity;
	}
	@Override
	public String toString() {
		return "Cost of that product is : " + this.cost;
	}
	
}
public class linkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,Amazon> lh = new LinkedHashMap<>();
		int opt;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1.Add New Product to Cart by enrolling the name & Price\n2.Remove the item from the cart by the name of the item\n3.View the Cart\n4.Total Amount for the products in your cart\n5.Exit\n\nEnter your Option:");
			opt = sc.nextInt();
			if(opt == 1) {
				System.out.print("\nEnter the name of your product and it's price :");
				String item = sc.next();
				double cost = sc.nextDouble();
				int quantity = sc.nextInt();
				lh.put(item,new Amazon(cost,quantity));
				System.out.println("Product Added Successfully...!");
			}
			else if (opt == 2) {
				if(lh.size()!=0) {
					boolean flag = true;
					System.out.print("Enter the name of the product that is to be removed:");
					String id = sc.next();
					for(Map.Entry<String,Amazon> val:lh.entrySet()) {
						if(id.equalsIgnoreCase(val.getKey())) {
							lh.remove(id);
							System.out.println("The Product is removed from the cart!");
							flag = false;
						}
					}
					if(flag) {
						System.out.println("No such record is found!");
					}
				}
				else {
					System.out.println("Your Cart is empty!");
				}
			}
			else if(opt == 3) {
				if(lh.size()!=0) {
					System.out.println("______________________________________"+"____________________________________"+"______________________________________");
					System.out.println("|                                     |"+"                                    |"+"                                    |");
					System.out.println("|          Product Name               |"+"               Price                |"+"               Quantity             |");
					System.out.println("|_____________________________________|"+"____________________________________|"+"____________________________________|");
					for(Map.Entry<String,Amazon> val:lh.entrySet()) {
						System.out.println("|   Product : "+val.getKey()+"                     | "+val.getValue()+"    | "+" Total Quantity "+val.getValue().getQuantity()+"                 |");
					}
					System.out.println("|_____________________________________|"+"____________________________________|"+"____________________________________|");
				}
				else {
					System.out.println("Your card is empty!");
				}
			}
			else if(opt == 4) {
			    if(lh.size() != 0) {
			        double totalAmount = 0.0;
			        for(Map.Entry<String, Amazon> val : lh.entrySet()) {
			            totalAmount += val.getValue().getAmt();
			        }
			        System.out.println("Total Amount for the products in your cart is: " + totalAmount);
			    } else {
			        System.out.println("Your cart is empty!");
			    }
			}
			else if(opt == 5) {
				System.out.println("End of program");
				break;
			}
		}
		sc.close();
	}
}
