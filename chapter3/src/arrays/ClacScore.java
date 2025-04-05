package arrays;

import java.util.Scanner;

public class ClacScore {

	public static void main(String[] args) {
		//성적처리 프로그램- 사용자 입력 방식
		//프로그램 시작과 종류 - 스위치 변수
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("==========================================");
			System.out.println("1.학생수 |2.점수 입력 |3.점수 리스트 |4.분석 |5.종류");
			System.out.println("==========================================");
			System.out.println("선택> ");
			
			int menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			break;
			case 2:
				for(int i = 0; i< scores.length; i++) {
					System.out.print("score[" + i +"]>");
					scores[i] = sc.nextInt();
				}
			break;
			case 3:
				for(int i = 0; i< scores.length; i++) {
					System.out.println("score[" + i +"]=" + scores[i]);
					scores[i] = sc.nextInt();
				}
			break;
			
			
			
			case 5:
				System.out.println("프로그램을 종류합니다");
				run = false;
				break;
				default: 
					System.out.println("잘못된 선택입니다. 다시 입력하세요");
				break;
				
				
				
				
			}
			
		
		
		
		
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
