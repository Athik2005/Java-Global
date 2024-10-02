package Collection;

import java.util.*;

public class vectorList {

	public static void main(String[] args) {
		List<Integer> arr = new Vector<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println("After inserting 10,20,30");
		Iterator<Integer> itrIterator = arr.iterator();
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
		arr.addFirst(0);
		System.out.println("After Adding 0 element @ First");
		for(Integer val:arr) {
			System.out.println(val);
		}
		arr.addLast(100);
		System.out.println("After Adding 100 element @ Last");
		for(Integer val:arr) {
			System.out.println(val);
		}
		System.out.println("First Element : "+arr.getFirst());
		System.out.println("Last Element : "+arr.getLast());
		if(arr.contains(100))
			System.out.println("Element Exists");
		else
			System.out.print("No such Element exists");
	}

}
