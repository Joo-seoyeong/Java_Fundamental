package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverScanningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/");
		InputStream in = url.openStream();
		
		// 1. InputStream을 InputStreamReader로 스트림 채이닝한다
		// 2. InputStreamReader를 BufferedReader로 스트림 채이닝한다
		// 3. BufferedReader로 읽은 정보(HTML)를 C:\dev\io\2019\12\2\naver.html 파일로 저장한다
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		fw = new FileWriter("c:\\dev\\io\\2019\\12\\naver.html");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			//System.out.println(readLine);
	 		pw.println(readLine);
		}
		
	}
}
