package STREAMS;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp_detail{
String name;
    int age;
    String dept;
    Emp_detail(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "EmployeeStream1 [name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDept() {
        return dept;
    }
}
public class hometask {

public static void main(String[] args) {
        List<Emp_detail> employees = new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
// String name,department;
// int age,opt;
// System.out.println("1.Add,2.Exit");
// opt=sc.nextInt();
// do {
// System.out.println("Enter the Name: ");
// name=sc.next()+sc.nextLine();
// System.out.println("Enter the Age: ");
// age=sc.nextInt();
// System.out.println("Enter the Department: ");
// department=sc.next()+sc.nextLine();
// EmployeeStream1 empdt=new EmployeeStream1(name,age,department);
// emp.add(empdt);
// System.out.println("1.Add,2.Exit");
// opt=sc.nextInt();
// }while(opt!=2);


        employees.add(new Emp_detail("SHANDEEP", 28, "M.sc"));
        employees.add(new Emp_detail("KIRUTHIK", 25, "M.sc"));
        employees.add(new Emp_detail("ATHIK", 33, "M.sc"));
        employees.add(new Emp_detail("SURETHAN", 27, "M.sc"));
        employees.add(new Emp_detail("YUKESH", 38, "B.sc"));
        employees.add(new Emp_detail("MADDY", 48, "B.tech"));

        final double AGE_LIMIT = 30;
        List<String> employee = employees.stream()
            .collect(Collectors.groupingBy(Emp_detail::getDept))
            .entrySet().stream()
            .filter(entry -> {
                double avg = entry.getValue().stream()
                    .mapToInt(Emp_detail::getAge)
                    .average()
                    .orElse(0);
                return avg >= AGE_LIMIT;
            })
            .flatMap(entry -> entry.getValue().stream().map(employee1 -> employee1.name.toLowerCase()))
            .sorted()
            .collect(Collectors.toList());

        System.out.println(employee);

}

}