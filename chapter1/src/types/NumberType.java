package types;

public class NumberType {

	public static void main(String[] args) {
		
		System.out.println("*********** 정수 자료형 *********");
		
		//byte(1byte) - 8bit(256) : -128 ~ 127
		byte bDate1= 127;
		//byte bDate2= 128;
		
		System.out.println(bDate1);
		//System.out.println(bDate2);
		
		//int(4byte) - 16bit(43억) : -23억 ~ 21억
		int iNum1 = 220000000;
		//int iNum2 = 2200000000; 오류
		System.out.println(iNum1);
		//long(8byte) - 64bit
		long lNum = 2200000000L; // L을 붙힘
		System.out.println(lNum);
		
		
		System.out.println("*********** 실수 자료형 *********");
		//float은 소수 6자리까지 출력
		float fNum = 1.234567F; // 끝에 F를 붙힘
		System.out.println(fNum);
		//double은 소수 16자리까지 출력
		double dNum = 1.2345678990123456;
		System.out.println(dNum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
