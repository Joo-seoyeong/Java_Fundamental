package java_20191127.step5;

// 1. 실제 비지니스 로직을 해당 클래스에 추가하자
// 2. 클래스들의 공통 요소가 있으면 부모 클래스로 만들어보자

public class StopWatchDemo {
	public void execute(StopWatch s){ // 추상클래스에 대한 다형성
		s.run(); // 추상클래스는 객체를 생성할 수 없으므로 stopwatch에서 추상객체를 넣을 수 없기 때문에 
	}			//클래스를 상속받은 객체를 넣어 오버라이딩된 run을 호출

	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo(); // 객체 만들어서 메서드로 호출 	
		StopNanoWatch s = new StopNanoWatch();
		swd.execute(s); // execute에 어떤 reference가 들어오냐에 따라 메서드가 달라짐
		
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);
		
		StopMicroWatch s2 = new StopMicroWatch();
		swd.execute(s2);
	}
		
}

