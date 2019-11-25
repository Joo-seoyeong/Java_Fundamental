package java_20191122;

public class Customer {
	// name부터 isReleased 까지  instance 변수 -> 객체가 생성될때마다 생성되는 변수
	public String name; 
	public String email;
	public String phone;
	public int age;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	public static final String BANKNAME="신한은행"; // final 변수는 관례상 변수명을 대문자로 쓴다
}

