package day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileCopyTest {
		
		@Ignore
		@Test
		@DisplayName("파일복사")
		public void copy() throws IOException {
			FileOutputStream fw = new FileOutputStream("c:/Temp/copy.txt");
			InputStream inputStream = new FileInputStream("c:/Temp/data.txt");
			
			int readByte;
			while((readByte = inputStream.read()) != -1 ) {	//ctrl + z
				fw.write(readByte);
			}
			fw.close();
		}
		@Ignore
		@Test
		@DisplayName("Reader 복사")
		public void copy2() throws IOException {
			FileWriter fw = new FileWriter("c:/Temp/copy3.txt");
			FileReader fr = new FileReader("c:/Temp/data.txt");
			
			int bytesRead = 0;
			char[] readByte = new char[5];
			while( (bytesRead = fr.read(readByte)) != -1 ) {	//ctrl + z
				fw.write(readByte, 0 ,bytesRead);
			}
			fw.close();
		}
		@Ignore
		@Test
		@DisplayName("버퍼를 통해서 라인입력")
		public void 버퍼입력 throws IOException {
			BufferedReader fr = new BufferedReader(
			  new FileReader("emp.txt"));
			
			  String str = null;
			  while((str = fr.readLine()) != null) {
				  System.out.println(str);
			  }
			fr.close();
		}
		@Test
		@DisplayName("스캐너를 통해서 라인입력")
		public void 스캐너입력() throws IOException {
			Scanner scanner = new Scanner(new File("c:/Temp/emp.txt"));
			String emp = scanner.nextLine();
			
			//steven 이름 출력 //spilt -> String
			
		}

}
