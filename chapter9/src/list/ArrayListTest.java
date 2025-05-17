package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//list 타입(인터페이스)으로 arraylist(구현 클래스) 객체 생성
		List<String> vegeList = new ArrayList<>();

		//요소
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//출력
		System.out.println(vegeList);

		//요소의 수
		System.out.printf("총 요소수: %d개\n",vegeList.size());
		
		//특정 요소 검색
		//인덱스 검색은 안됨,get(인덱스) 사용
		System.out.println(vegeList.get(0)); 
		System.out.println(vegeList.get(1));
		System.out.println(vegeList.get(2));
		
		//특정 위치에 추가
		vegeList.add(2, "콩나물");
		
		//요소 수정 set(인덱스, 요소) 함수
		vegeList.set(1, "상추");
		
		
		//전체 출력
		for(int i = 0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.print(vegetable + " ");
		}
		//요소 삭제 remove
	    vegeList.remove("감자");
	    
	    
	    System.out.println();
	    //향상 for
	    for(String vegetable : vegeList)
	    	System.out.print(vegetable + " ");
		
	}

}
