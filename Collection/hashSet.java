package Collection;
import java.util.*;
public class hashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> l1 = new HashSet<>();
		String course = null;
		hashSet h1 = new hashSet();
		//Iterator<String> itr = l1.iterator();
		System.out.println("\nWelcome to Workshop Registration panel");
		System.out.println("\nEnter the name of course you wish to register : ");
		course = sc.next();
		l1.add(course);
		h1.success_msg(course);
		while(true) {
			System.out.println("\nContinue Registration(Y/N)");
			String opt = sc.next()+sc.nextLine();
			if(opt.equalsIgnoreCase("Y")) {
					System.out.println("\nEnter the course name:");
					course = sc.next();
					if(l1.contains(course)) {
						System.out.println("The course "+course+" is already registered register for new courses!");
					}
					else {
						l1.add(course);
						h1.success_msg(course);
					}
			}
			else {
				System.out.println("List of courses you registered");
				for(String val:l1) {
					System.out.println("Course Name : "+val);
				}
				/*while(itr.hasNext()) {
					System.out.println(itr.next());
				}*/
				//System.out.println(l1);
				break;
			}
		}
		sc.close();
	}
	public void success_msg(String course) {
		System.out.println("The course "+course+" is registered successfully!");
	}
}
