package java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[] j, String str){
		i = 20;
		j[3] = 400;
		str += "123";
	}
	public static void main(String[] args) {
		int a = 10;
		int b[] = {1,2,3,4}; 
		String str = "abc";
		System.out.println(a);
		System.out.println(b[3]);
		System.out.println(str);
		
		CallByRefDemo.change(a,b,str); // a => call by value, b => call by reference
		                           // 같은 클래스 내에서는 클래스 명 생략 가능
	
		System.out.println(a); // call by value 메서드 호출 후 변화 없음
		System.out.println(b[3]); // call by reference 메서드 호출 후 변화 있음
		System.out.println(str);
		
		
		int[] c; // 메모리 할당이 되지 않는다
		// System.out.println(c); // 메모리에 올라와있지 않기 때문에 오류 발생
		c = new int[4];    // 동시에 이루어짐
	
		
		int[] d = null; // 변수 선언 시 메모리에 올리고 싶으면 null을 입력  // 멤버변수일때 reference는 기본값이 null이고  primitive는 기본값이 0
		System.out.println(d); // 메모리에 올라와있기 때문에 null이 출력 // boolean형은 false가 기본값 character의 기본값은 \u0000(?)
		d = new int[4];
		
		int age; // 선언만할뿐 메모리에 올라와있지 않다
		//int t = age + 20; // 연산 불가능 => 연산하려면 int age = 0;이라고 선언
		//System.out.println(age); 
		age = 10;
	}
}
