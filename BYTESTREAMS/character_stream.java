package BYTESTREAMS;
import java.io.*;
public class character_stream {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\input.txt");
			FileWriter out = new FileWriter("C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\output.txt");
			in.transferTo(out);
			System.out.println("File Copied!");
		}catch(Exception e) {}
	}

}
