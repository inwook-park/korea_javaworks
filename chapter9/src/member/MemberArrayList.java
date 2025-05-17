package member;

import java.util.ArrayList;

//화원을 관리하는(추가, 조회, 삭제)하는 클래스
public class MemberArrayList {
	// ArrayList 
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public void showAllMember() {
		for(int i= 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member); 
			
		}
	}
	
	public boolean removeMember(int memberId) {
		for(int i= 0; i<arrayList.size(); i++) {
			//이미 등록된 memberId를 dbId에 저장
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다."); 
		
		return false;
	}
	
	
}
