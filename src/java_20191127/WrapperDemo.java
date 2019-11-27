package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에
		// primitive data type을 객체화할 수 있는 Wrapper class로 변환하여 저장해야한다. 
		ArrayList list = new ArrayList(); // arraylist -> 리스트를 관리하는 클래스
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(1);
		
		int a = i1.intValue() + i2.intValue();
		
		// 자바 1.5 또는 자바 5.0 이후
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); // auto-boxing : primitive을 wrapper로 변환
		list1.add(2); // auto-boxing
		
		Integer i3 = list1.get(0);
		Integer i4 = list1.get(1);
		
		int b = i3 + i4; // reference끼리 연산할 수 없기 때문에 auto-unboxing : wrapper를 primitive로 변환
		
		String str = 10 + ""; // String.valueOf(10);
		
		// 문자열을 int로 바꿀 때 사용 
		int d = Integer.parseInt("100");
		
		
		
	}
}