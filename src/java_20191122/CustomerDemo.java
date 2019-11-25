package java_20191122;

public class CustomerDemo {
	public static void main(String[] args){
		Customer c1 = new Customer();
		c1.name = "주서영";
		c1.email = "wntj95@naver.com";
		
		System.out.println(c1.name + " , " + c1.email);
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.email = "mayayosi@yahoo.co.jp";
		
		System.out.println(c2.name + " , " + c2.email);
		
		Customer c3 = new Customer();
		c3.name = "베조스";
		c3.email = "ceo@amazon.com";
		
		System.out.println(c3.name + " , " + c3.email);
		
		Customer c4 = c3;
		c4.name = "잡스";
			
		System.out.println(c3.name + " , " + c3.email);
		
		Customer c5 = new Customer();
		c5.name = "손정의";
		c5.email = "mayayosi@yahoo.co.jp";
		
		System.out.println(c2 == c5); // false -> 서로 다른 객체이기 때문
		System.out.println(c3 == c4); // True -> 같은 object를  참조하기 때문
		

		// static 변수는 reference 변수로 접근 가능하나 일반적으로 클래스 이름으로 접근한다
		c1.interestRate=10.2;
		System.out.println(c3.interestRate); 
		
		Customer.interestRate = 12.2; 
		// static 변수는 new라고 하지 않아도 클래스 이름으로 가지고 올 수 있다.
		
		System.out.println(Customer.interestRate);
		
		// Customer.BANKNAME = "국민은행"; 
		// bankname은 final 변수이므로 수정 불가능 -> customer 파일에서 변경해야함
	
	}
}
 