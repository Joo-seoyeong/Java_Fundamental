package java_20191126;
// i18n => Internationalization 국제화 ( 한국어를 영어로 )
// l10n => Localization 지역화
public class StaticInitializationDemo {
	int age; // instance variable
	static String title; // static variable      // static 변수는 static 블럭에서 초기화
	static{
		System.out.println("static block");      // main 함수 전에 메모리에 올라와있고 title을 먼저 할당하고 메인에 들어와서
		title = "모기지론";						 // 객체 생성을 하면 constructor 3개가 호출됨
	}
	// 생성자의 접근 한정자는 객체 생성과 관련있다. 
	private StaticInitializationDemo(int age){
		this.age = age; // static 초기화는 생성자에서 한다
		System.out.println("constructor");
	}
	
	public static void main(String[] args){
		System.out.println("main");
		new StaticInitializationDemo(10); 
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
	}
}
 