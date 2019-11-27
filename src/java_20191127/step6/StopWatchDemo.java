package java_20191127.step6;

// 1. 모든 클래스의 Encapsulation ( 맨 마지막 단계에서 해준다 )
// 2. 메인 클래스의 Java Reflection 추가 (해당 클래스, 메서드 등을 뽑아낼 수 잇다)

public class StopWatchDemo {
	public void execute(StopWatch s){ // 추상클래스에 대한 다형성
		s.run(); // 추상클래스는 객체를 생성할 수 없으므로 stopwatch에서 추상객체를 넣을 수 없기 때문에 
	}			//클래스를 상속받은 객체를 넣어 오버라이딩된 run을 호출

	public static void main(String[] args) throws Exception {
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s = (StopWatch)Class.forName(className).newInstance();
		StopWatchDemo swd = new StopWatchDemo(); // 객체 만들어서 메서드로 호출 	
		swd.execute(s);
		
		
	}
		
}

