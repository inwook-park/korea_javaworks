package Inputs;

import java.util.Scanner;

public class Inputex1 {

	public static void main(String[] args) {
		//입력 처리 - scanner 클래스 사용
		// Scanner 객체 생성
		// System은 java.lang패키지 인데 암포트 안함
		Scanner  scanner = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?:");
		String name = scanner.nextLine();
		System.out.println("당신의 이름은 "+ name + "이군요!");
		
		System.out.print("당신의 나이는 몇살인가요?");
		int age = scanner.nextInt();
		System.out.println("당신의 나이은 "+ age + "살이군요!");
		
		
		

		
		
		
		
		
		
		//Scanner 객체 종류
		scanner.close();
		

	}

}
