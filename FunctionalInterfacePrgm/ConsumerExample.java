package FunctionalInterfacePrgm;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> num = (number) -> System.out.println(number);
		num.accept(100);
	}

}
