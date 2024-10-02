package Collection;
import java.util.*;
class enrollment{
	//String regNo;
	Scanner sc = new Scanner(System.in);
	List<String> l1 = new Vector<>();
	Iterator<String> itr = l1.iterator();
	enrollment(){
	}
	public void enroll() {
		System.out.println("\nEnter new student:");
		l1.add(sc.next());
		System.out.println("New Student Enrolled Successfully!");
	}
	public void remove() {
		System.out.println("\nEnter the name of the student:");
		if(l1.remove(sc.next())) {
			System.out.println("Removed Successfully!");
		}
		else
			System.out.println("Unsuccessful remove operation!");
	}
	public void show_details() {
		if(l1.isEmpty())
			System.out.println("\nNo Students Enrolled!");
	else {
		System.out.println("Displaying Student Details");
		for(String val:l1) {
			System.out.println(" Name: "+val);
		}
	
	}
	
}
}
public class student_enrollment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		enrollment e1 = new enrollment();
		while(true) {
					System.out.println("\n1.Register New Student\n2.Remove Student\n3.View Data\nEnter your option:");
					int opt = sc.nextInt();
					if(opt==1) {
						e1.enroll();
					}
					else if(opt==2) {
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