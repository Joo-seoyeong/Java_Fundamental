package java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k, int e){
		int sum =  k + e;
		double avg = (double)sum/(double)2;
		return avg;
	}
	
	public static void main(String[] args) {
		try{
			int k = Integer.parseInt(args[0]); // 0번째, 1번째가 없어서 에러 발생 -> run configurations에서 인자 대입해야함 
			int e = Integer.parseInt(args[1]); // 만약 40 5a를 넣으면 5a에서 NumberFormatException 발생 => RuntimeException이 부모 클래스(예외 처리해도되고 안해도됨)
			double average = getAvg(k,e);
			System.out.printf("평균 : %f", average);
		}catch(NumberFormatException e){
			//e.printStackTrace(); // 에러가 난 경로 확인 / 개발 초창기때는 이걸로 확인
			//System.out.println(e.getMessage()); // 에러 메시지 확인 
			System.err.println("숫자를 넣어주세요"); // try catch로 예외를 잡으면 에러 발생하지않는다 
												//out은 표준 출력 , err.는 catch블록에 쓰는 출력
		}catch(ArrayIndexOutOfBoundsException e){ // runtime이 부모라서 에러 잡을수도 안잡을수도 있음
			System.err.println("국어와 영어 점수를 넣어주세요"); // 3번째 인자를 입력해도 출력 x
		}
	}

}
