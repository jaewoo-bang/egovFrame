package day4;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		
		int readByte;
		while((readByte = System.in.read()) != -1 ) {	//ctrl + z
			 fw.write(readByte);
		}
		fw.close();
	}
}
