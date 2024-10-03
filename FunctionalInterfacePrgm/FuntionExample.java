package FunctionalInterfacePrgm;
import java.util.function.Function;
public class FuntionExample {

	public static void main(String[] args) {
		Function<String,String> test = (str)->str.toLowerCase();
		System.out.println(test.apply("HELLO"));
		System.out.println(test.apply("WORLd"));
	}

}
