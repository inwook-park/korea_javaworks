package statics;

public class MyMathTest {

	public static void main(String[] args) {
		// 수학 관련 클래스 제공 받음
		//static을 포함한 메서드는 클래스 이름으로 직접 접근함 new X
		//절대값 계산
		System.out.println("절대값" + Math.abs(-5));
		System.out.println("절대값" + MyMath.MyAbs(-5));
		
		
		//거듭제곱 계산
		System.out.println("거듭제곱" + Math.pow(2, 3));
		System.out.println("거듭제곱" + MyMath.MyPow(2, 3));
		//1부터 4까지 곱하기
		/*int hap = 0;
		for(int i = 0; i <=4; i++) {
			hap = hap + i;
		}
		System.out.println("합계" +hap);
		
		
		int gop = 1;
		for(int i = 0; i <=4; i++) {
			gop *= i;
		}
		System.out.println("곱하기" +hap);*/
	}	
}
