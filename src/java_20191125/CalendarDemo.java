package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	private int totalCount;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// 매개변수 1개짜리 생성자 => 생성자의 오버로딩 가능(밑에 2개짜리, 3개짜리 생성자도 만들 수 있으므로)
	public CalendarDemo(int y){ 
		//year=y;
		this(y,0,0);
	}
	
	// 매개변수 2개짜리 생성자
	public CalendarDemo(int y, int m){ 
		//year=y;
		//month=m;
		this(y,m,0);
	}
	
	// 매개변수 3개짜리 생성자 
	public CalendarDemo(int year, int month, int day){ // 반환값 x, 클래스 이름과 동일
		this.year=year; //this. 을 붙이면 로컬변수와 멤버변수 구분 가능
		this.month=month;
		this.day=day;
		getTotalCount();
	}
	
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
		getTotalCount();
	}
	
	private int getTotalCount(){
		// preYear => 2018년도
		int preYear = year - 1;
		// preMonth => 2019년 11월
		int preMonth = month - 1;
		//int totalCount = 0;

		// 2018년도까지 총일 수 구하기
		totalCount = preYear * 365 + 
				(preYear / 4 - preYear / 100 + preYear / 400);
		//2019년도가 윤년인지 판단한다.
		boolean isLeafYear = 
				year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		//2019년도가 윤년이면 2월 29일로 변경한다.
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		// 2019년도 11월까지 합 구하기
		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}
		
		//2019년 11월까지 합을 구했으면 날짜를 더하여 총 일수를 구한다.
		totalCount += day;
		
		return totalCount;
	}
	public void print(){
		String message = null;
		int dayOfWeek = totalCount % 7;
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", 
				year, month, day, message);

	}
	/*1. 
	public CalendarDemo(){
		
	} 
	*/
	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo(2019,12,25);
		// 다른 생성자가 없으면 compiler가 자동으로 매개변수 없는 생성자 호출 
		// 그러나 위에서 매개변수가 있는 생성자가 있기 때문에 에러 발생 -> 에러가 나지 않게 하려면 1. 디폴트 생성자를 만들거나 2. 매개변수 추가
		// 2. CalendarDemo c = new CalendarDemo(2019,12,25); -> 이거 하면 밑의 2줄도 필요없이 바로 c.print();
		c.set(2019,12,25);
		c.getTotalCount();
		c.print();
	}
}















