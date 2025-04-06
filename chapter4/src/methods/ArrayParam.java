package methods;

public class ArrayParam {
	
	//배열의 합계를 계산하는 함수 정의
	
	public static int add(int[] score) {
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	
	
	
	
	
	//실행문-main()
	public static void main(String[] args) {
		// 매서드의 매개 변술 배열을 전달
		int[] num = {1, 2, 3, 4};
		int result = add(num);
		
		System.out.println(result);
	}

}
