package java_20191127.step6;

public class StopMilliWatch extends StopWatch {
	
	private void start(){
		setStartTime(System.currentTimeMillis()); // super는 상위와 하위의 변수가 충돌할때 사용(
	}
	
	private void stop(){
		setEndTime(System.currentTimeMillis());
	}
	
	private double getElapsedTime(){
		return (double)(getEndTime() - getStartTime()) / (double) 1000;
	}
	
	public void run(){
		start();
		
		for (long i = 0; i < 50000000000l; i++) {

		}
		
		stop();
		
		double elapsedTime = getElapsedTime();
		
		System.out.printf("경과시간 : %.3f %n", elapsedTime);
		
	}
	
}
