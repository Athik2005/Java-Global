package TYPES_OF_STREAM;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eg_seq_stream {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Name","Age","Salary");
		Stream<String> start_stream = str.stream();
		start_stream.map(
				str_1 -> str_1.toLowerCase()
		).forEach(
				str_1 -> System.out.println(str_1)
		);
		List<String> output = str.stream().map(
				str_1 -> str_1.toLowerCase()
		).collect(Collectors.toList());
		System.out.println(output);
	}

}
