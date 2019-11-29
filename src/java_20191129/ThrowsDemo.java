package java_20191129;

import java.io.FileOutputStream;

public class ThrowsDemo {
	public static double getAverage(int[] temp) 
			throws ArrayIndexOutOfBoundsException{  //예외가 날수도 잇고 안날수도 잇으니까 그냥 던져버림
		int sum = 0;
		int k = temp[0];
		int m = temp[1]; //밑의 메서드에서 10만 입력했기 때문에 여기서 에러가 나서 throw를 하면 try catch에서 catch블럭에 있는 객체 e를 호출해서 문장을 출력
		int e = temp[2];
		int h = temp[3];
		sum = k+m+e+h;
		return (double)sum / (double)4;
	}   // 배열에 값을 집어넣으면 평균을 구해주는 메서드
	
	public static void main(String[] args) {
		int[] exam = {10};
		try{
			double avg = getAverage(exam);
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("국어, 영어, 수학, 국사 4과목을 입력해야합니다");
		}
		
	
	}
	
}
