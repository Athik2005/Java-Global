package Collection;
import java.util.*;
class Employee{
	//private String EmpId;
	private String Name;
	private String Emp_Role;
	private double Salary;
	public Employee(String name, String emp_Role, double salary) {
		//HashMap<String,Employee> mp = new HashMap<>();
		//ArrayList<Employee> values = new ArrayList<>();	
		//this.EmpId = empId;
		this.Name = name;
		this.Emp_Role = emp_Role;
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Emp_Role=" + Emp_Role + ", Salary=" + Salary + "]";
	}
}

public class MapInterface {

	public static void main(String[] args) {
		HashMap<String,Employee> mp = new HashMap<>();
		Scanner sc = new Scanner(System.in);
	        int opt;

	        while (true) {
	            System.out.println("1. Add New Employee\n2. Display All Employee Details\n3. Delete the Employee by ID\n4. Display details of that specific employee\n5. Exit\nEnter your option:");
	            opt = sc.nextInt();

	            if (opt == 1) {
	                System.out.println("Enter Employee Details");
	                System.out.println("Enter Employee ID: ");
	                String EmpID = sc.next();
	                System.out.println("Enter Employee Name: ");
	                String Name = sc.next();
	                System.out.println("Enter Employee Role: ");
	                String role = sc.next()+sc.nextLine();
	                System.out.println("Enter Employee Salary: ");
	                double Salary = sc.nextDouble();
	                Employee e1 = new Employee(Name,role,Salary);
	                mp.put(EmpID, e1);
	                System.out.println("New Employee Added Successfully!");
	            } else if (opt == 2) {
	            	if(mp.size()==0) {
	            		System.out.println("No Employee added!");
	            	}
	            	else {
	            		System.out.println("Employee Details:");
	            		for (Map.Entry<String,Employee> entry:mp.entrySet()) 
	            		{
	            			System.out.println("Employee ID is : "+entry.getKey()+" and his values : "+entry.getValue());
	            		}
	            	}
	            }
	            else if (opt == 3) {
	            	if(mp.size()==0) {
	            		System.out.println("No Employee added!");
	            	}
	            	else {
	            		System.out.println("Enter the Employee ID that is to be deleted:");
	            		String id;
	            		id = sc.next();
	            		for (Map.Entry<String,Employee> entry:mp.entrySet()) 
	            		{
	            			//System.out.println("Employee ID is : "+entry.getKey()+" and his values : "+entry.getValue());
	            			if(id.equalsIgnoreCase(entry.getKey())) {
	            				mp.remove(id);
	            				System.out.println("Deletion Successful");
	            			}
	            			else {
	            				System.out.println("No such Employee Found!");
	            			}
	            		}
	            	}
	            }
	            else if (opt == 4) {
	            	if(mp.size()==0) {
	            		System.out.println("No Employee added!");
	            	}
	            	else {
	            		System.out.println("Enter the Employee ID that is to be displayed:");
	            		String id;
	            		id = sc.next();
	            		for (Map.Entry<String,Employee> entry:mp.entrySet()) 
	            		{
	            			//System.out.println("Employee ID is : "+entry.getKey()+" and his values : "+entry.getValue());
	            			if(id.equalsIgnoreCase(entry.getKey())) {
	            				System.out.println("Values : "+entry.getValue());
	            			}
	            			else {
	            				System.out.println("No such Employee Found!");
	            			}
	            		}
	            	}
	            }
	            else if (opt == 5) {
	                System.out.println("Turning Off..!");
	                break;
	            } else {
	                System.out.println("Invalid option. Please try again.");
	            }
	    }
	}
}
