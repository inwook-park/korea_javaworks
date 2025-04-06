package methods;

public class ReturnMethods {
	
	//main()-프로그램을 실행하는 함수- 실행문
	public static void main(String[] args) {
		
		
		int value = sqaure(8); // sqaure(x) 호출
		double value2 = add(3, 4);
		String value3 = message();
		
		
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
	}
	
	//제곱수를 계산하는 함수 - 매개변수 1개
	public static int sqaure(int x) {
		return x *x;
	}

	//두 실수를 더하는 함수 - 매개변수 2개
	public static double add(double x, double y) {
		return x+y;
	}
	
	
	//메세지를 출력하는 함수 - 매개변수 1개
	public static String message() {
		return "생일 축하합니다";
	}
	
	
	
	
	
}
