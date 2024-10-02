package Comparator;
import java.util.*;

class Employee {
    private String EmpID;
    private String Name;
    private int Age;
    private double Salary;

    public Employee() {}

    public Employee(String empID, String name, int age, double salary) {
        this.EmpID = empID;
        this.Name = name;
        this.Age = age;
        this.Salary = salary;
    }

    public String getEmpID() {
        return this.EmpID;
    }

    public void setEmpID(String empID) {
        this.EmpID = empID;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [EmpID=" + this.EmpID + ", Name=" + this.Name + ", Age=" + this.Age + ", Salary=" + this.Salary + "]";
    }
}

class SalarySort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() != e2.getSalary()) {
            return Double.compare(e2.getSalary(), e1.getSalary());
        }
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}

public class Comparator_Interface {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>(new SalarySort());
        Scanner sc = new Scanner(System.in);
        int opt;

        while (true) {
            System.out.println("1. Add New Employee\n2. Display All Employee Details\n3. Exit\nEnter your option:");
            opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("Enter Employee Details");
                System.out.println("Enter Employee ID: ");
                String EmpID = sc.next();
                System.out.println("Enter Employee Name: ");
                String Name = sc.next();
                System.out.println("Enter Employee Age: ");
                int Age = sc.nextInt();
                System.out.println("Enter Employee Salary: ");
                double Salary = sc.nextDouble();
                
                Employee employee = new Employee(EmpID, Name, Age, Salary);
                employees.add(employee);
                System.out.println("Employee Registration Successful...!");
            } else if (opt == 2) {
                System.out.println("Employee Details:");
                for (Employee emp : employees) {
                    System.out.println(emp);
                }
            } else if (opt == 3) {
                System.out.println("Turning Off..!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
