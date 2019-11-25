package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	
	public int getTotalcount(){
		//preYear => 2018년도
		int preYear=year-1;
		//premonth => 2019년 11월
		int preMonth=month-1;
		int totalcount=0;
		
		//2018년도까지 총 일수 구하기
		totalcount=preYear*365 + (preYear/4-preYear/100 +preYear/400);
		
		//2019년도가 윤년인지 판단한다
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		// 2019년도가 윤년이면 2월 29일로 변경한다
		if (isLeafYear){
			monthArray[1]=29;
		}
		
		// 2019년도 11월까지 합 구하기
		for (int i=0;i<preMonth;i++){
			totalcount+=monthArray[i];
		}
		
		//2019년 11월까지 합을 구했으면 날짜를 더하여 총 일수를 구한다
		totalcount += day;
		
		return totalcount;
	}
	public void print(int count){
		String message = null;
		int dayOfWeek=count % 7;
		if (dayOfWeek == 1){
			message="월요일";
		}else if (dayOfWeek ==2){
			message="화요일";
		}else if (dayOfWeek ==3){
			message="수요일";
		}else if (dayOfWeek ==4){
			message="목요일";
		}else if (dayOfWeek ==5){
			message="금요일";
		}else if (dayOfWeek ==6){
			message="토요일";
		}else if (dayOfWeek ==7){
			message="일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.",
				year, month, day, message);
		
	}
	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.set(2019,12,25);
		int count = c.getTotalcount();
		c.print(count);
	}
}

















