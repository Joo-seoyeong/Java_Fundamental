package java_20191127;
/** => 자바 documendation 주석 
 이 클래스는 인터페이스를 테스트합니다
 */
public class ImplementClassDemo {
	/**
	 이 메서드는 JVM이 호출해주는 메서드입니다
	 */
	public static void main(String[] args) {
		//Date d = new Date(); // 위의 import한 곳에서 *이 (=Date)가 둘 다 있기 때문에 모호함
		java.util.Date d = new java.util.Date();
		InterA a = new ImplementClass(); // 변수에 대한 타입은 Interface
		a.mA();
		a.mB();
		a.mC();
	}
}
