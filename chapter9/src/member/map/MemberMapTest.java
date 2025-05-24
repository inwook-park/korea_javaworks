package member.map;

import member.Member;

public class MemberMapTest {

	public static void main(String[] args) {
		//객체 생성
		MemberHashMap memberMap = new MemberHashMap();

		//회원 추가
		memberMap.addMember(new Member(1001, "삼성"));
		memberMap.addMember(new Member(1002, "엘지"));
		memberMap.addMember(new Member(1003, "네이버"));
		//회원 목록
		memberMap.showAllMember();
		//회원 삭제
		memberMap.removeMember(1001);
		memberMap.removeMember(1004);
		
		memberMap.showAllMember();
		
	}

}
