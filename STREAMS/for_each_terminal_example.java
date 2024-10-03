package STREAMS;

import java.util.*;
import java.util.stream.Stream;

public class for_each_terminal_example {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Athik","Athi","Ath","At","A");
		names.stream().map( name -> name.toLowerCase()).forEach( name -> System.out.println("Hello"+" "+name));
	}

}
