package BYTESTREAMS;
import java.io.*;
public class byte_stream_prgm {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\input.txt");
			FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\output.txt");
			in.transferTo(out);
			System.out.println("File Copied!");
		}catch(Exception e) {}
	}

}
