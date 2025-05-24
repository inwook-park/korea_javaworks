package member;

//member 클래스 - 참조 자료형 만들기
public class Member {
	
	private int memberId; //회원 아이디
	private String memberName;//회원 이름 
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	
	//설정자
	public int getMemberId() {
		return memberId;
		
	}
	
	public void memberName(String memberName) {
		this.memberName = memberName;
	}
	public String memberName() {
		return memberName;
		
	}
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	
}
