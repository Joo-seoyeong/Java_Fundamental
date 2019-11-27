package java_20191127.step6;

public abstract class StopWatch {
	// 멤버변수에 대한 Encapsulation
	private long startTime;
	private long endTime; // private은 상속이 안됨 
	
	public void setStartTime(long startTime){ //setter 메서드 -> 정보 수정
		this.startTime = startTime; // 두번째 startTime는 로컬변수
	}
	
	public long getStartTime(){ // getter 메서드 -> 멤버변수를 가져온다
		return startTime;
	}
	
	public void setEndTime(long endTime){
		this.endTime = endTime;
	}
	
	public long getEndTime(){
		return endTime;
	}
	
	public abstract void run();
	
}
