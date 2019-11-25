package Homework;

public class Homework2 {

	public static void main(String[] args) {
		// 문자 reverse 하기
		// 1. input "abcd" => "dcba"
		// 2. input "abcde" => "edcba"
		String input = "abcd"; // "abcde"
		char[] ch = input.toCharArray(); // 문자열을 캐릭터 배열로 바꿈
		
		for (int i = 0; i < ch.length/2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
		}
		
		System.out.println(new String(ch));
		
		// 1-100까지 소수를 구하시오
		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i ; j++) {    // 1과 자기 자신을 포함시키지않고 
				if (i % j == 0){              // 하나라도 2로 나누어져서 
					count++;                  // count가 1이 되면
					break;                    // break문 때문에 빠져나가 소수가 아님
				}
				
			}
			if(count==0){
				System.out.print(i+" ");
			}
			
		}
	}

}
