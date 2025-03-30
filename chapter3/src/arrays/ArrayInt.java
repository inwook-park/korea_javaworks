package arrays;

public class ArrayInt {

	public static void main(String[] args) {
		//배열 - 여러개의 연속된 자료를 저장하는 자료 구조
		//배열의 크기가 4인 정수형 배열 선언
		//int[] number = new int[4];
		//0번 인덱스 접근(조회)
		//System.out.println(number[0]);
		int i = 0;
		//for(i=0; i < 4; i++) {
		//	System.out.println(i);
		//}
				//요소 저장
		//number[0] = 10;
		//number[1] = 20;
		//number[2] = 30;
		//number[3] = 40;
		
		
		
		
		
		//방법2 배열 선언과 동시에 초기화 (입력)
		int[] number = {10, 20, 30, 40, 50};
		//배열의 크기(길이)
		System.out.println("배열의 길이는 "+number.length +"입니다.");
		
		// 요소 수정
		number[2] = 100; //100을 대입 - 수정
		
		number[2] = 30; // 다시 30 대입 - 수정
		for(i=0; i < number.length; i++) {
			System.out.print(number[i]+ " ");
		}
		// 연산
		System.out.println(number[0] + number[1]);
		// 합계
		int sum = 0;
		
		for(i=0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.print("합계:" + sum);
		System.out.print("평균:" + ((double)sum)/ number.length);
		System.out.println();
		
	}
	
}
