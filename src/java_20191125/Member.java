package java_20191125;

public class Member {
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;  
	// private이므로 class가 다르면 접근 불가능 / 외부에서 수정 불가능
	
	// 멤버변수에 대한 setter/getter 단축키 : alt + shift + s => r => tab => enter => tab*4 => enter 
	
	// name에 대한 setter 메서드 -> 정보를 바꿀 수 있게 만들어준다 (매개변수 필요)
	public void setName(String n){
		name = n;
	}
	// name에 대한 getter 메서드 -> 정보를 가지고 올 수 있게 만들어준다 (매개변수 불필요)
	public String getName(){
		return name;
	}
	// zipcode에 대한 setter 메서드
	public void setZipcode(String z){
		zipcode = z;
	}
	// zipcode에 대한 getter 메서드
	public String getZipcode(){
		return zipcode;
	}
	// address1에 대한 setter 메서드
	public void setAddress1(String a){
		address1 = a;
	}
	// address1에 대한 getter 메서드
	public String getAddress1(){
		return address1;
	}
	// address2에 대한 setter 메서드
	public void setAddress2(String b){
		address2 = b;
	}
	// address2에 대한 getter 메서드
	public String getAddress2(){
		return address2;
	}
	// ssn에 대한 setter 메서드
	public void setSsn(String s){
		ssn = s;
	}
	// ssn에 대한 getter 메서드
	public String getSsn(){
		return ssn;
	}
	// age에 대한 setter 메서드
	public void setAge(int g){
		age = g;
	}
	// age에 대한 getter 메서드
	public int getAge(){
		return age;
	}
	// height에 대한 setter 메서드
	public void setHeight(double d){
		height = d;
	}
	// height에 대한 getter 메서드
	public double getHeight(){
		return height;
	}
	// password에 대한 setter 메서드
	public void setPassword(String p){
		password = p;
	}
	// password에 대한 getter 메서드
	public String getPassword(){
		return password;
	}
	// email에 대한 setter 메서드
	public void setEmail(String e){
		email = e;
	}
	// email에 대한 getter 메서드
	public String getEmail(){
		return email;
	}
}
