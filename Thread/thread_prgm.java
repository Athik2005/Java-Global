package Thread;
class task_1 extends Thread{
	public void run() {
		for(int  i = 0 ; i < 5; i++ ) {
			try {
				System.out.println("Hi "+Thread.currentThread().getName());
				//System.out.println("Hi");
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
		}
	}
}
class task_2 extends Thread{
	public void run() {
		for( int i = 0; i < 5; i++ ) {
			try {
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class task_3 implements Runnable{
	public void run() {
		for( int i = 0; i < 5; i++) {
			try {
				System.out.println("Heey!"+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class thread_prgm {

	public static void main(String[] args) throws Exception {
		Thread t1 = new task_1();
		Thread t2 = new task_2();
		task_3 t3 = new task_3();
		Thread t4 = new Thread(t3);
		Runnable run_1 = new Runnable() {
			public void run() {
				for(int i = 0 ;i < 5; i++) {
					try {
						System.out.println("Main Runnable!"+Thread.currentThread().getName());
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
			}
		};
		Thread t5 = new Thread(run_1);
		t1.setName("Hii Thread Running");
		t2.setName("Counter Loops Running");
		t4.setName("Runnable Interface!");
		t5.setName("Runnable Interface in Main!");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
		System.out.println("Blaahh");
	}

}
