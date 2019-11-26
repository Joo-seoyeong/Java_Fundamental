package java_20191126;

public class ShapeDemo {
	public static void run(Shape s){ // 매개변수를 추상클래스(Shape)로 받음
		s.draw(); 
	}
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없다
		// -> Shape s = new Shape(); 불가능
		Shape s1 = new Rectangle();
		s1.draw();
		
		Shape s2 =  new Triangle();
		s2.draw();
		
		run(new Rectangle());
		run(new Triangle());
		
		
	}
}
