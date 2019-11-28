package java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	 public static void main(String[] args) {
		// HashMap : key값은 반드시 유일해야하고 value에는 데이터(객체)를 저장하는데
		// 데이터의 중복을 허용한다. key값이 중복되는 경우는 덮어쓰기를 한다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("1", 11111); 
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666);
		
		Integer value = map.get("1");
		System.out.println(value);
		
		Set<String> set = map.keySet(); // key를 가져와서 set에 선언 / set은 데이터의 중복 허용하지않고 key도 중복 허용하지않는다
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			String key = i.next(); // 제너릭으로 선언해서 casting 안해도됨
			Integer v = map.get(key);
			System.out.format("key : %s, value : %d%n", key, v);
		}
	}
}

// list는 인덱스 map은 키값으로 하나의 객체를 불러올 수 있다. 
// set, list은 add로 map은 put으로 집어넣기
// map에서 key값만 알아내면 모든 값을 꺼낼 수 있다.