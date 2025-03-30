package arrays;

public class ArrayString {

	public static void main(String[] args) {
		// 문자열 배열 관리
		String[] cars = {"기아", "현대", "삼성"};
		
		//배열의 길이
		System.out.println("배열의 길이"+ cars.length);
		
		//삼성 찾기
		System.out.println(cars[2]);
		//현대를 도요타로 바꿈
		cars[1] = "도요타";
		
		//전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
