package loop;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 반복문 내부에 반복문 사용함
		// 행, 열로 표현
		int i= 1;
		int j= 1;
		
		for(i = 1; i <= 5; i++) { // 행 
			for(j = 1; j <= 5; j++) { // 열
				System.out.print("*");
			}
			System.out.println(); // 다음 행으로 줄바꿈
		}
		//직각 삼각형 모양의 별
		for(i = 1; i <= 5; i++) { // 행 
			for(j = 1; j <= i; j++) { // 열
				System.out.print("*");
			}
			System.out.println(); // 다음 행으로 줄바꿈
		}
		
				for(i = 1; i <= 5; i++) { // 행 
					for(j = 1; j <= 6 - i; j++) { // 열
						System.out.print("*");
					}
					System.out.println(); // 다음 행으로 줄바꿈
				}
				
		//전체 구구단
		for(i =2; i <=9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println();
		}
				
				
				
				
				
				
				
				
				
				
		
	}

}
