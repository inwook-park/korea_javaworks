package banking.run;

import java.util.List;
import java.util.Scanner;

import banking.domain.BankAccount;
import banking.domain.BankAccountDAO;

public class BankingMain {

	static BankAccountDAO accountDAO = new BankAccountDAO();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean sw = true;

        while (sw) {
            System.out.println("============================================");
            System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("============================================");
            System.out.print("선택> ");

            try {
                int selectNum = Integer.parseInt(scan.nextLine());

                switch (selectNum) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        getAccountList();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        withdraw();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        sw = false;
                        break;
                    default:
                        System.out.println("지원되지 않는 기능입니다. 다시 입력하세요");
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자를 정확히 입력하세요.");
            }
        }

        scan.close();
	}

	private static void getAccountList() {
		List<BankAccount> accountList = accountDAO.getAccountList();
		for(int i = 0; i < accountList.size(); i++) {
			BankAccount account = accountList.get(i);
			System.out.print("계좌번호: "+ account.getAno() + "\t");
			System.out.print("계좌주: "+ account.getOwner() + "\t");
			System.out.println(": "+ account.getBalance());
		}
		
	}
	

    private static void createAccount() {
        System.out.println("============================================");
        System.out.println("                 계 좌 생 성               ");
        System.out.println("============================================");
        
        while(true) {
        System.out.print("계좌번호: ");
        String ano = scan.nextLine();
        
        if(accountDAO.findAccount(ano) != null) {
        	System.out.println("이미 등록된 계좌입니다. 다시 입력해주세요.");
        }else {
        	System.out.print("계좌주: ");
            String owner = scan.nextLine();

            System.out.print("초기입금액: ");
            int balance = Integer.parseInt(scan.nextLine());

            BankAccount newAccount = new BankAccount(ano, owner, balance);
            accountDAO.createAccount(newAccount);
            System.out.println("결과: 계좌가 생성되었습니다.");
            break;
        }

        }
    }
    private static void deposit() {
        System.out.println("============================================");
        System.out.println("                예        금               ");
        System.out.println("============================================");

        System.out.print("계좌번호: ");
        String ano = scan.nextLine();

        System.out.print("입금액: ");
        int amount = Integer.parseInt(scan.nextLine());

        BankAccount account = accountDAO.findAccount(ano);

        if (accountDAO.findAccount(ano) != null) {
            accountDAO.deposit(ano, amount);
            System.out.println("결과: 정상 입금되었습니다. 현재 잔액: " + account.getBalance());
        } else {
            System.out.println("결과: 계좌가 없습니다.");
        }
    }
    private static void withdraw() {
        System.out.println("============================================");
        System.out.println("                출        금               ");
        System.out.println("============================================");

        System.out.print("계좌번호: ");
        String ano = scan.nextLine();

        System.out.print("출금액: ");
        int amount = Integer.parseInt(scan.nextLine());

        BankAccount account = accountDAO.findAccount(ano);

        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("결과: 정상 출금되었습니다. 현재 잔액: " + account.getBalance());
            } else {
                System.out.println("결과: 잔액이 부족합니다.");
            }
        } else {
            System.out.println("결과: 계좌가 없습니다.");
        }
    }
}
