package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 29;
		double d1 = 12.4567;
		System.out.printf("%10s , %d , %d , %.2f%n", str, a1, a2, d1);
		// f:실수형, s:문자형, d:정수형 -> 이거는 System.out.printf 일때 사용
		// 10s: 10자리에 맞춰서 결과 출력(굳이 필요없다), .2f : 소수점 둘째자리까지
		System.out.println(str + " , " + a1 + " , " + a2 + " , " + d1);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0){ // 짝수 합 구하기 => if문 대신 증감문에 2씩 증가하는 걸 넣어도 됨
				sum = sum + i;
			}
		}
		System.out.printf("1부터 100까지 합은 %d 입니다.%n", sum);
		
		// 구구단 만들기
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d%n", i , 2*i);	
		}
		//2단부터 9단까지 출력
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first*second);
			}
		}
		// 9단부터 2단까지 출력
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first*second);
			}
		}
		// 5 * 5 형태의 별
		for (int i = 0; i < 5  ; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		// 피라미드 모양 
		for (int i = 0; i < 5  ; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		// 역 피라미드 모양 
		for (int i = 0; i < 5  ; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		
	}
}















