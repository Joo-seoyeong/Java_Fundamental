package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1(){
		name = "sung"; // 인스턴스 메서드에서는 static 변수 사용 가능
		age = 10; // 인스턴스 메서드에서는 instance 변수 사용 가능
		m2(); // 인스턴스 메서드에서 instance 메서드 호출 가능
		m4(); // 인스턴스 메서드에서 static 메서드 호출 가능
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
	public static void m3(){
		name = "sung"; // static 메서드에서 static 변수 사용 가능
		//age = 10; // static 메서드에서 instance 변수 사용 불가능 -> 만약 사용하고 싶으면 객체 생성
		//m2(); // static 메서드에서 instance 메서드 호출 불가능
		StaticDemo sd = new StaticDemo();
		sd.age = 10;
		sd.m2();
		m4(); // static 메서드에서 static 메서드 호출 가능
			
	}
	public static void m4(){
		System.out.println("instance method m4()");
	}
	
}
