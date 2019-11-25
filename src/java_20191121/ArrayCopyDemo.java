package java_20191121;

public class ArrayCopyDemo {
	public static void main(String[] args){
		String[] fruits = {"apple","banana","watermelon","peach"};
		
		String[] temp = new String[6];
		// fruits => 원본 배열
		// 0 => 원본 배열의 위치, 즉 원본 배열의 복사할 시작 위치
		// temp => 복사할 배열
		// 2 => 복사할 배열의 시작 위치
		// 4 => 원본 배열의 4개 요소를 복사
		
		System.arraycopy(fruits,0,temp,2,4);
		temp[0]="blueberry";
		temp[1]="rasberry";
		
		for (String fruit : temp) {
			System.out.println(fruit);
		} // 여기서는 temp가 배열이 아니라 그냥 하나의 변수를 나타내므로 그냥 fruit이라고 함 , f라고 해도됨
		
		String[] ref = fruits;
		ref[0] = "jobs";
		
		System.out.println(fruits[0]);
		System.out.println(ref[0]);
		
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		int[] c = b;
		
		System.out.println(a==b);
		System.out.println(b==c);
		// System.out.println(a==ref); => a는 int이고 ref는 string이므로 비교 자체가 되지 않음
		
	}
}


















