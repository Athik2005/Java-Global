package Collection;
import java.util.*;
class visitor_enrollment{
	//String regNo;
	Scanner sc = new Scanner(System.in);
	//visitor_enrollment ve = new visitor_enrollment();
	LinkedHashSet<String> l1;
	
	visitor_enrollment(){
		l1 = new LinkedHashSet<>();
	}
	public void enroll() {
		System.out.println("\nEnter new visitor name:");
		l1.add(sc.next());
		System.out.println("New visitor enrolled Successfully!");
	}
	public void remove() {
		//.show_details();
		System.out.println("\nEnter the name of the guest to be removed :");
		if(l1.remove(sc.next())) {
			System.out.println("Guest removed successfully by the visitors!");
		}
		else
			System.out.println("No such guest found!");
	}
	public void show_details() {
		Iterator<String> itr = l1.iterator();
		if(l1.isEmpty())
			System.out.println("\nNo visitors Enrolled!");
		else {
			System.out.println("Displaying Guest Details");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
public class linkedHashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		visitor_enrollment e1 = new visitor_enrollment();
		while(true) {
					System.out.println("\n1.Register New Visitors\n2.Remove Guest\n3.View Data\nEnter your option:");
					int opt = sc.nextInt();
					if(opt==1) {
						e1.enroll();
					}
					else if(opt==2) {
						e1.show_details();
						e1.remove();
					}
					else if(opt==3) {
						e1.show_details();
					}	
					else {
						System.out.println("End!");
						break;
					}
		}
		sc.close();
	}
}