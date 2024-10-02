package Collection;
import java.util.*;
public class array_List {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println("After inserting 10,20,30");
		Iterator itrIterator = arr.iterator();
		System.out.println();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		System.out.println();
		arr.remove(1);
		System.out.println("After Removing Element @ index 1");
		System.out.println(arr);
		arr.add(20);
		System.out.println("After inserting 20");
		System.out.println(arr);
		System.out.println("Size of Array List is : "+arr.size());
		System.out.println();
		System.out.println("Elements fetched using get() method");
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();
		arr.remove(1);
		System.out.println("After Deleting element @ index 1");
		for(Integer val:arr) {
			System.out.println(val);
		}
		System.out.println();
		arr.add(20);
		System.out.println("After inserting 20");
		for(Integer val:arr) {
			System.out.println(val);
		}
	}
}
