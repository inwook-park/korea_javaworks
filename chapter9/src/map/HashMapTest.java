package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//요소 추가
		map.put("강감찬", 95);
		map.put("홍길동", 75);
		map.put("이순신", 80);
		//요소 수
		System.out.println("요소 수 - " + map.size() + "개");
		//요소 검색
		System.out.println("'홍길동의 점수는 " + map.get("홍길동") + "점");
		
		//요소 추가
		map.put("이순신", 90);
		
		//map 객체 출력
		System.out.println(map);
		
		//요소 삭제
		if(map.containsKey("홍길동")) {
			map.remove("홍길동");
		}
		
		//전체 출력- 반복자 클래스(iterator)
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) {// 요소가 있다면
			String key = ir.next();
			 Integer value = map.get(key);
			 System.out.println(key + " : " + value);
		}
	}

}
