package constant;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 -변하지 않는 값
		final int MIN_NUM = 0;
		final int MAX_NUM = 100;
		
		System.out.println(MIN_NUM);
		System.out.println(MAX_NUM);
		
		final double PI = 3.1415;
		int radius = 5;
		double area = PI * radius * radius;
		
		System.out.printf("원의 넓이: %.2f\n", area);
		
	}

}
