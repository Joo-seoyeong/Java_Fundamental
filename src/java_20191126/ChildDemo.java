package java_20191126;

public class ChildDemo {
	public static void main(String[] args){
		Parent p1 = new Parent();
		p1.age = 55;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 155.24;
		c1.playBadook();
		c1.playGame();
		c1.work();
	
		
		Parent p2 = new Child(); // child object 안에 parent object가 잇어야함
		p2.age = 25;
		//p2.height = 155.24; -> 자식에 있는거라서 호출 안됨
		p2.playBadook();
		//p2.playGame(); -> 자식에 있는거라서 호출 안됨
		p2.work(); // 자식에 잇는 work가 호출됨(오버라이딩된거는 자식 것이 호출됨)
		
		//Child c2 = (Child)new Parent(); // 강제로 casting -> 에러 발생 / 말이 안되는 코딩
		
	}
}

