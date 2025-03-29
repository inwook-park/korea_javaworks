package loop;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		/*
		 키 입력에 따른 동작 제어
		 ''-"계속 반복"
		 ''-"반복 중단"
		 그 이외의 키 -"지원되지 않음. 다시 입력"
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("반복할까요?(Y/N)");
			String key = scan.nextLine();
			
			if(key.equals("Y")) {
				System.out.println("계속 반복합니다.");
			}else if(key.equals("N")) {
				System.out.println("반복 중단합니다.");
				break;
			}else {
				System.out.println("키를 다시 입력하세요.");
			}
		}

	}

}
