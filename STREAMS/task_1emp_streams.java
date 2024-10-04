package STREAMS;
import java.util.*;
class Emp{
	String Emp_name;
	int age;
	String Dept;
	public Emp(String emp_name, int age, String dept) {
		this.Emp_name = emp_name;
		this.age = age;
		this.Dept = dept;
	}
}
public class task_1emp_streams {
	public static void main(String[] args) {
		List<Emp> value = new ArrayList<>();
		Emp e1;
		Scanner sc = new Scanner(System.in);
		int opt = 2;
		while(true) {
			if(opt==1) {
				System.out.println("Breaking Loops!");
				break;
			}
			else {
				System.out.print("Enter Name : ");
				String E_name = sc.next();
				System.out.print("Enter Age : ");
				int age = sc.nextInt();
				System.out.print("Enter Department : ");
				String dept = sc.next();
				e1 = new Emp(E_name,age,dept);
				value.add(e1);
			}
			System.out.println("\nEnter 1 to Stop Adding:");
			opt = sc.nextInt();
		}
		value.stream().filter( name -> name.age>30).map( name -> name.Emp_name.toLowerCase()).sorted().forEach( name -> System.out.println(name));
	}
}
