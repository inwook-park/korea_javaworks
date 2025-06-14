package users.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe";//경로
	 String username = "system";//이름
	static String password = "1234";//비밀번호
	
	
	
	public void insertUser(Users users) {
		//SQL - DML
		String sql = "INSERT INTO users(userid,userpassword,username,userage)"
				+ "VALUES (?, ?, ?, ?)";
		
		
		try(Connection conn = DriverManager.getConnection(url, username, password); 
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1, users.getUserId());
				pstmt.setString(2, users.getUserPassword());
				pstmt.setString(3, users.getUserName());
				pstmt.setInt(4, users.getUserAge());
				
				pstmt.execute();
		} catch (SQLException e) {
			// TODO: handle exception
		}	
	}
	public List<Users> getUserList(){
			String sql = "SELECT * FROM users";
		List<Users> userList = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(url, username, password); 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			
			while(rs.next()) {
						Users user = new Users();
						
						user.setUserId(rs.getString("userId"));
						user.setUserPassword(rs.getNString("userpassword"));
						user.setUserName(rs.getNString("username"));
						user.setUserAge(rs.getInt("userage"));
						userList.add(user);
					
					}
				
			}catch(SQLException e) {
			e.printStackTrace();
		}		
		return userList;
		}
	
	
	public void updateUser(Users user) {
		String sql = "UPDATE users SET userpassword = ?, username = ?, userage = ? "+"WHERE userid = ?";
	
		try(Connection conn = DriverManager.getConnection(url, username, password); 
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getUserAge());
			pstmt.setString(4, user.getUserId());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}
	public void deleteUser(String userId) {
		
		String sql = "DELETE FROM users WHERE userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password); 
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, userId);
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
	
	

