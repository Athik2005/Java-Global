package TYPES_OF_STREAM;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class sequential_stream {

	public static void main(String[] args) {
		//int ap = Runtime.getRuntime().availableProcessors();
		//System.out.println(ap);
		List<Integer> values = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		// List of Values from 1 to 10 using rangeClosed method and converted  as a List using Collectors mothod
		Stream<Integer> v = values.parallelStream();
		v.forEach( s -> {
			System.out.println(LocalTime.now()+" Value "+s+" Thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		});
	}
}
