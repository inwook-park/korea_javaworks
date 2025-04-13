package mamberservice;

public class MamberServiceTest {

	public static void main(String[] args) {
		// 
		MemberService service = new MemberService();
		
		boolean result = service.login("qwer", "1234");
		if(result) {
			System.out.println("로그인");
		}else {
			System.out.println("일치하지 않습니다.");
		}
		
		service.logout();
	}

}
