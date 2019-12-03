package java_20191203;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\test-copy.txt");
			/*
			int readChar = 0;
			while((readChar = fr.read()) != -1){
				System.out.print((char)readChar);
				fw.write(readChar);
			}
			*/
			
			char[] readChars = new char[100];
			int readCharCount = 0;
			while((readCharCount = fr.read(readChars)) != -1){
				System.
				 out.print(new String(readChars,0,readCharCount)); // 모니터에 출력
				fw.write(readChars,0,readCharCount); // 캐릭터 배열을 write
				//fw.write(new String(readChars,0,readCharCount)); //문자열을 file에 copy하겠다
			}
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} finally {
			try{
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e){
			e.printStackTrace();
		}
		}

	}
}

