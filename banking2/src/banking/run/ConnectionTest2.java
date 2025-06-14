package banking.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest2 {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe";//경로
	static String username = "javauser";//이름
	static String password = "pwjava";//비밀번호

	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("연결성공" + conn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
