package Thread;
class thread_Class extends Thread{
	public String fileName;
	public int size;
	public thread_Class(String fileName,int size){
		this.fileName = fileName;
		this.size = size;
	}
	public void run() {
		System.out.println("File "+this.fileName+" started Downloading..... 0%");
		try {
			for(int i = 1 ; i <= this.size; i++ ) {
				System.out.println("File "+this.fileName+" Downloading..... "+ i*10 +"%");
				Thread.sleep(1500);
			}
		}
		catch(Exception e) {
			System.out.println("Error interrupted in downloading!@#$**");
		}
	}
}
public class thread_task {
	public static void main(String[] args) throws InterruptedException {
		thread_Class c1 = new thread_Class("GOAT.mp4",10);
		thread_Class c2 = new thread_Class("Billa.mp4",10);
		c1.start();
		c1.join();
		System.out.println(c1.fileName+" downloaded Successfully!");
		System.out.println();
		c2.start();
		c2.join();
		System.out.println(c2.fileName+" downloaded Successfully!");
	}

}
