package Choice;

import java.util.Scanner;

/*
 
		학점 계산 프로그램
		90점~ 100점:A
		80점~ 89점:B
		70점~ 79점:C
		60점~ 69점:F

*/

public class IfElse4 {

	public static void main(String[] args) {
		// 다중 조건문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int sc = scan.nextInt();
		
		
		
		//int sc = 96;
		char grade; // 한 문자를 저장할 변수 grade 선언
		
		if(sc >= 90 && sc <= 100){
			grade = 'A';
		}else if(sc >= 80) {
			grade = 'B';
		}else if(sc >= 70) {
			grade = 'C';
		}else{
			grade = 'F';
		}
		
		
		
		
		
		
		System.out.println("학점은 " + grade + "입니다");
		
		
		
		
		scan.close();
	}
	}


