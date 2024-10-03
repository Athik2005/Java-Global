package STREAMS;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class stream_prgm {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		boolean output = l1.stream().filter( num -> num%2==0 ).anyMatch( num -> num==4 );
		System.out.println(output);
		Stream<String> str = Stream.of("ABC","B","CEF").filter(s -> s.length()==3);
		List<String> ans = str.collect(Collectors.toList());
		System.out.println(ans);
	}
}
