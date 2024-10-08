package BYTESTREAMS;
import java.io.*;
public class image_stream {

	public static void main(String[] args) {
		String imageURL = "C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\image.jpg";
		String destinationURL = "C:\\Users\\Administrator\\eclipse-workspace\\JAVA_GLOBAL\\src\\BYTESTREAMS\\output.jpg";
		try {
			FileInputStream io = new FileInputStream(imageURL);
			FileOutputStream out = new FileOutputStream(destinationURL);
			io.transferTo(out);
			System.out.println("Image Copied!");
		}catch(IOException e) {}
	}

}
