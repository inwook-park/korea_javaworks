package classes;

public class BankAccountTest {

	public static void main(String[] args) {
		// BankAccount 객체 생성

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("222-333", "김현동", 20000000);
		
		
		//account1.ano = "1111";
		account1.setAno("111-222");
		account1.setOwner("홍길동");
		account1.setBalance(10000000);
		
		//account1의 정보 출력
		account1.displayInfo();
		//account2의 정보 출력
		account2.displayInfo();
		
		
		
	}

}
