package banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 은행업무  프로그램 - 예금,출금,잔액 조회
		Scanner sc = new Scanner(System.in);
		boolean run = true;//상태를 바꿀 수 있는 스위칭 변수
		int balance = 0;
		
		
		while(true) {
			//메뉴 만들기
			System.out.println("==========================");
			System.out.println("1.예금|2.적금|3.잔액 조회|4.종류");
			System.out.println("==========================");
			System.out.print("선택> ");
			
			int selectNum = sc.nextInt();
			int amount = 0;
			switch(selectNum) {
			case 1:
				System.out.print("예금액> ");
				amount = sc.nextInt();
				balance+= amount;
				System.out.println("정상 입금되었습니다. 현재 잔액: " + balance);
				break;
			case 2:
				System.out.print("출금액>");
				amount = sc.nextInt();
				if(balance< amount) {
					System.out.println("잘못 눌렀습니다. 다시 입력해 주세요.");
					break;
				}
				balance -= amount;
				System.out.println("정상 출금되었습니다. 현재 잔액: "+ balance);
				break;
				
			case 3:
				System.out.println("잔액> "+ balance);
				break;
			case 4:
				System.out.println("프로그램을 종류합니다."); 
				run = false;
				break;
				default:
					System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택해 주세요.");
					break;
			}
		}
	}
}
