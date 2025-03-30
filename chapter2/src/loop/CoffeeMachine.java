package loop;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 - 커피 가격은 500원
		Scanner sc = new Scanner(System.in);
		
				
		int coffee = 1000; // 커피 총 수량
		
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			int money =sc.nextInt();
			if(money==5000) {
				System.out.println("커피가 나옵니다.");
				coffee -= 1;
			}else if(money > 5000) {
				System.out.println("거스름돈" + (money - 5000) + "원을 돌려주고 커피가 나옵니다");
				coffee -= 1;
			}else {
				System.out.println("돈을 돌려주고 커피가 나오지 않습니다");
			}
			System.out.println("남은 커피의 양은 " + coffee + "입니다");
			
			//커피가 모두 소진
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되었습니다. 판매를 중단합니다.");
				break;
			}
			
			
			
			
			
			
			
		}	
	}
}
