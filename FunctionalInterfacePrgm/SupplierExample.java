package FunctionalInterfacePrgm;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> send_msg = () -> "Program Ending!"; //returns whatever given in the computation
		System.out.println(send_msg.get());//used to fetch user-defined computed returned values
		Consumer<Integer> num = (number) -> System.out.println(number); //consumes input from the user and performs hidden computations
		num.accept(100);//used to send input 
		Function<String,Integer> input = (str) -> str.length();
		System.out.println(input.apply("Hellow"));
		Predicate<Integer> p1 = (number) -> (number%2 == 0);
		System.out.println(p1.test(100));
	}
}
