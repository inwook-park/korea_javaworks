package Choice;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		// 조건문 -if문
		// 나이가 15세 이상임녀 "관람가" 출력
		// 그렇지 않으면 관람불가
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age = scan.nextInt();
		
		
		
		
		
		//int age = 16;
		
		/*if(age >= 15) {
			System.out.println("관람가");
		}
		System.out.println("나이는 "+ age + "세 입니다.");*/
		
		// if ~else 구문
		
		
		if(age >= 15) {
			System.out.println("관람가");
		}else {
			System.out.println("관람불가");
		}
		
		
		System.out.println("나이는 "+ age + "세 입니다.");
		
		scan.close();
		
		
		
		
	
		
	}

}
