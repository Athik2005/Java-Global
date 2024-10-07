package Thread;

public class thread_stream {

	public static void main(String[] args) {
		Runnable task = () -> {
				String nameOfThread = Thread.currentThread().getName();
				System.out.println("Hello from "+nameOfThread);
		};
		Thread t1 = new Thread(task,"Java");
		t1.start();
	}

}
