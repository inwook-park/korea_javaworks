package member.map;

import java.util.HashMap;
import java.util.Iterator;

import member.Member;

public class MemberHashMap {
	//hashmap 자료 구조 객체 생성
	HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
//추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
//조회
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();		
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}





}

