package banking.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class BankAccountDAO {
	
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
	
	//계좌 생성
	public void createAccount(BankAccount account) {
		String sql = "INSERT INTO bank_account VALUES (?, ?, ?);";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, account.getAno());
			pstmt.setString(1, account.getOwner());
			pstmt.setInt(1, account.getBalance());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
	public List<BankAccount> getAccountList(){
		String sql = "SELECT * FROM bank_account";
		List<BankAccount> accountList = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
				
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
			
			
			BankAccount account = new BankAccount(ano, owner, balance);
			accountList.add(account);
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
			}
		return accountList;
	}
	public BankAccount findAccount(String ano) {
		String sql = "SELECT * FROM bank_account WHERE ano = ?";
		BankAccount account = null;
		

		try(Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, ano);
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					ano = rs.getString("ano");
					String owner = rs.getString("owner");
					int balance = rs.getInt("balance");
					account = new BankAccount(ano, owner, balance);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	
	
	public void deposit(String ano, int money) {
      
		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() + money;
		
		String sql = "UPDATE bank_account SET owner = ?, balance = ?" + "WHERE ano = ?";
		try(Connection conn = DriverManager.getConnection(url, username,password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
					
				pstmt.setString(1, owner);
				pstmt.setInt(2, balance);
				pstmt.setString(3, ano);
					
				pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}

}
}