package java_20191126;

public class Sub extends Super {
	String chicken;
	public Sub(){
		super(0); // 디폴트 생성자가 없기때문에 에러 발생하지만 값을 넣어주면 에러 안남 / 부모 클래스의 디폴트 생성자를 호출
	}
	
	public  void gotoSchool(){
		System.out.println("Sub gotoSchool()");
	}
}
