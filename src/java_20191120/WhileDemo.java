package java_20191120;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // 초기값을 바깥에 선언
		while (i <= 100) {
			sum += i;
			i++; // 증감을 while문 안에 선언
		}
		System.out.printf("1부터 100까지 합은 %,d입니다.%n", sum); // %,d : 3자리 단위로 ,가 찍힘

		int first = 2;
		while (first <= 9) {
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d * %d%n", first, second, first * second);
				second++;
			}
			first++;
		}
	}
}

