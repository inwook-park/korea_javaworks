package mamberservice;

public class MemberService {
	//로그인 일치 여부를 반환하는 메서드
	public boolean login(String id, String password) {
		//
		//
		if(id.equals("qwer") && password.equals("1234"))
			return true;
			return false;
		
	}
	
	
	
	
	
	
	
	public void logout() {
		System.out.println("로그아웃");
	}
}
