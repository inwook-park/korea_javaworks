package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
		Users user = new Users();
		UsersDAO dao = new UsersDAO();
		
//		user.setUserId("cloud");
//		user.setUserPassword("123234");
//		user.setUserName("구름");
//		user.setUserAge(34);
//		dao.insertUser(user);
		//System.out.println(user.getUserId());
		
		//System.out.println(user);
		
		//회원 수정
//		Users renewUser = new Users();
//		renewUser.setUserId("today");
//		renewUser.setUserPassword("1234");
//		renewUser.setUserName("이종법");
//		renewUser.setUserAge(23);
		//회원 삭제
		dao.deleteUser("cloud");
		
		List<Users> userList = dao.getUserList();
		for(int i = 0; i<userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}
		
//		Users getUser = dao.getuser("Korea");
	//	System.out.println(getUser);
		
		
		
	}
}
