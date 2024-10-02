package Collection;
import java.util.*;

class Library{
	//private String prd_name;
	private String author;
	private int quantity;
	private double cost;
	public Library(String author,double cost,int quantity) {
		this.cost = cost;
		this.author = author;
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
		return "Library [ Author = " + author + ", Quantity = " + quantity + ", Cost = " + cost + " ]";
	}
	
		
}
public class LibraryManagamentTreeMap {

	public static void main(String[] args) {
		TreeMap<String,Library> lh = new TreeMap<>();
		int opt;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1.Add New Book to your Library by enrolling the ISBN Author Cost & Quanity(with spaces)\n2.Remove the book from the library by the ISBN of the book\n3.View the Book using the ISBN ID\n4.Total Amount for the products in your cart\n5.View All Available Books\n6.Exit\n\nEnter your Option:");
			opt = sc.nextInt();
			if(opt == 1) {
				System.out.print("\nEnter the ISBN of your book it's author it's price and it's quantity(with spaces) :");
				String id = sc.next();
				String author = sc.next();
				double cost = sc.nextDouble();
				int quantity = sc.nextInt();
			    lh.put(id,new Library(author,cost,quantity));
				System.out.println("Product Added Successfully...!");
			}
			else if (opt == 2) {
				if(lh.size()!=0) {
					boolean flag = true;
					System.out.print("Enter the ISBN of the book : ");
					String id = sc.next();
					for(Map.Entry<String,Library> val:lh.entrySet()) {
						if(id.equalsIgnoreCase(val.getKey())) {
							lh.remove(id);
							System.out.println("The Book with ISBN "+id+ " is removed from the cart!");
							flag = false;
						}
					}
					if(flag) {
						System.out.println("No such record is found!");
					}
				}
				else {
					System.out.println("Your Library is empty!");
				}
			}
			else if(opt == 3) {
					if(lh.size()!=0) {
						boolean flag = true;
						System.out.print("Enter the ISBN of the book : ");
						String id = sc.next();
						for(Map.Entry<String,Library> val:lh.entrySet()) {
							if(id.equalsIgnoreCase(val.getKey())) {
								System.out.println("The Book with ISBN "+id+ " is "+val.getValue());
								flag = false;
							}
						}
						if(flag) {
							System.out.println("No such record is found!");
						}
					}
					else {
						System.out.println("Your library is empty!");
					}
				}
				else if(opt == 4) {
				    if(lh.size() != 0) {
				        double totalAmount = 0.0;
				        for(Map.Entry<String, Library> val : lh.entrySet()) {
				            totalAmount += val.getValue().getAmt();
				        }
				        System.out.println("Total Amount for the books in your library is: " + totalAmount);
				    } else {
				        System.out.println("Your library is empty!");
				    }
				}
				else if(opt == 5) {
					for(Map.Entry<String, Library> val:lh.entrySet()) {
						System.out.println("Key : "+val.getKey()+" Value is : "+val.getValue());
					}
				}
				else if(opt == 6) {
					System.out.println("End of program");
					break;
				}
			}
		sc.close();
		}
	}

