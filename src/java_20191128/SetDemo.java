package java_20191128;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet은 데이터(객체)의 중복을 허용하지 않고 순서가 없음
		//HashSet set = new HashSet(); // 이거 치고 ctrl+shirt+o 누르면 알아서 import해줌 
		
		// TreeSet은 데이터(객체)의 중복을 허용하지 않고 출력 시 오름차순 정렬한다
		TreeSet<Integer> set = new TreeSet<Integer>(); // <Integer>을 쓴것이 generic
		while(true){
			int random = (int)(Math.random()*45) + 1;
			set.add(random); // 위에서 generic을 선언했기 때문에  integer만 들어갈 수 있다
			if(set.size()==6) break;
		}
		
		Iterator<Integer> i = set.iterator(); // generic으로 선언하면 밑에서 casting하지 않아도 됨
		while(i.hasNext()){               // hasNext() : HashSet에 출력할 객체가 존재하는지 판단하는 메서드
			int temp = (Integer)i.next(); // next() : 해당 객체를 가져온다 
			System.out.print(temp + "\t");
		}
		
		HashSet<Test> s = new HashSet<Test>();
		s.add(new Test(10));
		s.add(new Test(20));
		s.add(new Test(10)); // 두 개의 10은 서로 다른 객체로 인식 equals 메서드와 HashSet을 오버라이딩해야 하나의 객체로 인식
		
		System.out.println(s.size()); // => size 3으로 나옴
		
	}
}
class Test{
	int a;
	Test(int a){
		this.a = a;
	}
	@Override   // 오버라이딩 단축키 shfit arl s 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	
}



















