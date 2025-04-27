package bankapp;

import java.util.Scanner;

public class BankMain {
	
	static BankAccount[] accounts = new BankAccount[100];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			
			System.out.println("============================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종류");
			System.out.println("============================================");
			System.out.print("선택> ");
			
			
			
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch(selectNum) {
			case 1:
				createAccount();
				break;
			case 2:
				getAccontlist();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종류합니다.");
				sw = false;
				break;
			default:
				System.out.println("지원되지 않는 기능입니다. 다시 입력하세요");
				break;
							
			}
			
		}
		scan.close();
	}

	private static void withdraw() {
		//출금System.out.println("============================================");
		System.out.println("                출        금                ");
		System.out.println("============================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		System.out.print("출금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if(findAccount(ano) != null) {
			BankAccount account = findAccount(ano);
			
			account.setBalance(account.getBalance()-amount);
			System.out.println("결과: 정상 출금되었습니다. 현재 잔액: "+ account.getBalance());
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
		
		

	private static BankAccount findAccount(String ano) {
		BankAccount account = null;
		for(int i= 0; i< accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) {
					account = accounts[i];
					break;
				}
			}
		}
		
		
		return account;
		
	}
	
	
	private static void deposit() {
		//예금
		System.out.println("============================================");
		System.out.println("                예        금                ");
		System.out.println("============================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		System.out.print("입금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if(findAccount(ano) != null) {
			BankAccount account = findAccount(ano);
			
			account.setBalance(account.getBalance()+amount);
			System.out.println("결과: 정상 입금되었습니다. 현재 잔액: "+ account.getBalance());
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}

	private static void getAccontlist() {
		//계좌 목록
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
			System.out.print("계좌번호: "+ accounts[i].getAno() +"\t");
			System.out.print("계좌주: "+ accounts[i].getOwner() +"\t");
			System.out.print("잔고: "+ accounts[i].getBalance() +"\n");
			}
		}
	}

	private static void createAccount() {
		//계좌 생성
		System.out.println("============================================");
		System.out.println("                 계 좌 생 성                   ");
		System.out.println("============================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		for(int i= 0; i< accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = new BankAccount(ano, owner, balance);
				System.out.println("곃과: 계좌가 생성되었습니다");
				break;
			}
		}
		
//		accounts[0] = new BankAccount(ano, owner, balance);
//		System.out.println("곃과: 계좌가 생성되었습니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
