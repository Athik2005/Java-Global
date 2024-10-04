package TYPES_OF_STREAM;
import java.util.*;
import java.util.stream.Collectors;
public class partitioning_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		List<Integer> ages = new ArrayList<>();
		while(true) {
			System.out.println("Enter Age for Person "+count+" : ");
			int age = sc.nextInt();
			ages.add(age);
			System.out.println("Ages for person "+count+" added !");
			System.out.print("Enter 1 to exit & any to continue:");
			int opt = sc.nextInt();
			if(opt == 1)
				break;
			count += 1;
		}
		Map<Boolean,List<Integer>> partitioned = ages.stream().collect(Collectors.partitioningBy( age -> age >= 18));
		System.out.println(partitioned);
		
	}

}
