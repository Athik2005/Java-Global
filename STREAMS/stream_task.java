package STREAMS;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class stream_task {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5).filter( num -> num % 2 != 0);
		List<Integer> ans = numbers.collect(Collectors.toList()); 
		System.out.println(ans);
	}

}
