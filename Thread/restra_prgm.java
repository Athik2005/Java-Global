package Thread;
import java.util.*;
class restra_Class extends Thread{
	public String cust_name;
	public String food_name;
	public restra_Class(String name1,String name2) {
		this.cust_name = name1;
		this.food_name = name2;
	}
	public void run() {
		try {
			System.out.println("The Food "+this.food_name+" for "+this.cust_name+" is being processed!");
			System.out.println("Started preparing food... 10%");
			for(int i = 1 ; i <= 3;i++) {
				System.out.println("Preparing Food.."+ i * 30 +"%");
				Thread.sleep(3000);
			}
			System.out.println("Completed Food..100%");
			System.out.println("Mr/Mrs. "+this.cust_name+" your food "+this.food_name+" is ready!");
		}
		catch(Exception e) {}
	}
}
public class restra_prgm {

	public static void main(String[] args) throws Exception {
		List<restra_Class> list_cust = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		restra_Class e1;
		while(true) {
			System.out.print("Enter name of the Customer:");
			String name = sc.next();
			System.out.print("Enter name of the food:");
			String food = sc.next()+" "+sc.next();
			e1 = new restra_Class(name,food);
			list_cust.add(e1);
			System.out.println("Thanks for your order!");
			System.out.println("Enter Y/N to Continue??");
			if(sc.next().equals("N"))
				break;
		}
		System.out.println("Displaying Orders");
		for(int i = 0; i<list_cust.size();i++) {
			list_cust.get(i).start();
			list_cust.get(i).join();
			System.out.println();
		}
	}

}
