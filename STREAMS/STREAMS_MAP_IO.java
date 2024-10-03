package STREAMS;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class STREAMS_MAP_IO {

	public static void main(String[] args) {
		Stream<String> np = Stream.of("A","B").map(val -> val.toLowerCase());
		List<String> result = np.collect(Collectors.toList());
		System.out.println(result);
	}

}
