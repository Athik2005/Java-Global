package Collection;
import java.util.*;
public class reverse_using_stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid input:");
		String str = sc.next();
		Stack<Character> input = new Stack<>();
		char[] str_array = str.toCharArray();
		for(int i = 0;i<str_array.length;i++) {
			input.push(str_array[i]);
		}
		StringBuilder ans = new StringBuilder();
		while(!input.isEmpty()) {
			ans.append(input.pop());
		}
		System.out.println("Reversed String : "+ans);
		sc.close();
	}

}
