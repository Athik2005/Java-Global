package Collection;
import java.util.*;
public class stack_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> l1 = new Stack<>();
		while(true) {
			System.out.println("\n1.Insert Operation\n2.Delete Operation\n3.Peek Operation\n4.View Data\n5.Reset data\n6.Check for Empty\nEnter your option:");
			int opt = sc.nextInt();
			if(opt==1) {
					System.out.println("\nEnter new value:");
					l1.push(sc.nextInt());
			}
			else if(opt==2) {
					System.out.println(l1.pop());
					System.out.println(l1);
			}
			else if(opt==3)
					System.out.println(l1.peek());
			else if(opt==4)
					System.out.println(l1);
			else if(opt==5) {
				l1.clear();
				System.out.println(l1);
			}
			else if(opt==6) {
				if(l1.isEmpty())
						System.out.println("\nYes the Stack is Empty");
				else
					System.out.println("\nNo the Stack is Empty");
			}
			else {
				System.out.println("End of Loop!");
				break;
			}
		}
		sc.close();
	}
}
