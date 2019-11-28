package java_20191128;
import java.lang.*;
public class Member extends Object {
	private String id;
	private String name;
	public Member(String id, String name) { 
		super(); // 모든 생성자에는 super가 숨어있음 -> 있어도 되고 없어도 된다
		this.id = id;
		this.name = name; // 나중에 초기화할 수 있는 생성자 만들기
	}
	public String getId() {     // setter, getter 단축키 : alt+shift+s+r 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
