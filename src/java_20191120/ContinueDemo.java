package java_20191120;

public class ContinueDemo {
	public static void main(String[] args){
		int sum=0;
		for (int i = 0; i < 10; i++) {
			if(i==6) continue;
			sum += i;
		}
		System.out.println(sum);
		
		// if(true) return; => method 안에 있는 이하의 문장은 수행하지 않는다, void로 호출할때만 사용 가능
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==6) continue;//continue 이하의 문장은 수행하지 않고 계속 한다
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
		
		outter :
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==5) continue outter; // continue 이하의 문장은 수행하지 않고 outer로 돌아간다
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}
}
