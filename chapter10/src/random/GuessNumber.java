package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		// 숫자 추측 게임
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = rnd.nextInt(30) + 1;
		
		while (true) {
			System.out.println("숫자를 입력하세요(1~30): ");
			int you = sc.nextInt();
			
			if(you < 1 || you > 30) {
				System.out.println("범위를 벗어났어요! 다시 입력해주세요: ");
			}
			
			else if(you == com) {
				System.out.println("정답!");
				break;
			}
			else if(you > com) {
				System.out.println("너무 커요!");
			}
			else {
				System.out.println("너무 작아요!");
			}
			
			
		}
		sc.close();
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
