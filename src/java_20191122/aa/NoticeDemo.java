package java_20191122.aa;

public class NoticeDemo {
	
	public static void main(String[] args){
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		// 같은 패키지안에 잇는 다른 클래스를 생성해서 멤버 변수를 생성하면 private는 접근할 수 없다
		//n.regdate = "2019-11-22"; 
	}
}
