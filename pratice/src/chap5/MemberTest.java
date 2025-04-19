package chap5;

public class MemberTest {

	public static void main(String[] args) {
		
		Member[] members = new Member[3];
		
		members[0] = new Member("홍길동","q2112");
		members[1] = new Member("김우주","w3232");
		members[2] = new Member("빅하늘","e4545");
		
		
		System.out.println("========회원 정보=========");
		for(int i = 0; i<members.length; i++)
			members[i].showMemberInfo();
		
		
		//향상된 포문
		//for(자료형 변수 : 배열 이름 ){}
		for(Member member : members)
			member.showMemberInfo();
				
		
		
	}

}
