package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		//모듈 지우기 충돌 일어남
		Connection conn = null;
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe",
				"system",
				"1234"
				);
		System.out.println(conn + "db 연결 성공");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
