package Collection;
import java.util.*;
class Patient{
	public String name;
	public int severity;
	public Patient(String name,int severity) {
		this.name = name;
		this.severity = severity;
	}
	@Override
	public String toString() {
		return "Patient [ Name : " + name + ", Severity : " + severity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass()!=obj.getClass()) return false;
		Patient patient = (Patient)obj;
		return severity == patient.severity && name.equals(patient.name);
	}
	@Override
	public int hashCode() {
		return name.hashCode()+severity;
	}
}
public class priority {

	public static void main(String[] args) {
		PriorityQueue<Patient> patient = new PriorityQueue<>(Comparator.comparingInt(p->p.severity));
		Scanner sc = new Scanner(System.in);
		Iterator<Patient> disp;
		Patient p1;
		while(true) {
				System.out.println("\n1.Add Patient\n2.Treat Next Patient\n3.View next patient\n4.Remove a patients\n5.View Queue Size\n6.Clear the Queue\n7.Exit\nEnter your options:");
				int opt = sc.nextInt();
				if(opt==1) {
					System.out.print("Enter the Patient Name :");
					String patient_name = sc.next();
					System.out.print("Enter the Patient's Priority :");
					int priority = sc.nextInt();
					p1 = new Patient(patient_name,priority);
					patient.add(p1);
					System.out.println("Patient Added Successfully");
				}
				else if(opt == 2) {
					System.out.println(patient.poll());
				}
				else if(opt == 3) {
					System.out.println(patient.peek());
				}
				else if(opt == 4) {
					System.out.print("Enter the name of patient:");
					String name = sc.nextLine();
					disp = patient.iterator();
					while(disp.hasNext()) {
						if(disp.next().equals(name))
							disp.remove();
					}
				}
				else if(opt == 5) {
					System.out.println(patient.size());
				}
				else if(opt == 6) {
					patient.clear();
				}
				else if(opt == 7) {
					System.out.println("End of Loop");
					break;
				}
		}
	}
}
