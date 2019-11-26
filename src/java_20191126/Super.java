package java_20191126;
import java.lang.*;
public class Super extends Object {
	int money;
	public Super(){
		super(); 
	}
	
	public Super(int money){
		super();
		this.money=money;
	}
	
	public void makeMoney(){  // extends object 생략
		System.out.println("Super makeMoney()");
	}
	
	public void play(String omok){
		System.out.println("Super play()");
	}
}
