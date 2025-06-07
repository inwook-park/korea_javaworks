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
		List<Users> userList = dao.getUserList();
		for(int i = 0; i<userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}

	}

}
