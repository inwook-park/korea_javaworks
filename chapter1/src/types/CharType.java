package types;

public class CharType {

	public static void main(String[] args) {
		//문자 및 문자열 자료형 
		System.out.println("*******문자열 자료형**********");
		
		//char(2byte) - 16bit: -32000~ 32000
		char ch1 = 'B';
		
		System.out.println(ch1);
		System.out.println((int)ch1); // 아스키 코드 (int) 명시적 형변환
		
		//System.out.println("");
		
		char ch2 = 67;
		//int ch2 = 67;
		System.out.println(ch2); // 아스키 코드 67 = c
		
		int ch3 = 79;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char kor1 = '가';
		System.out.println(kor1);
		
		
		char kor2 = '\uAC00'; // 유니코드
		System.out.println(kor2);
		// 문자열은 쌍따움표로 표시한다
		System.out.println("*******문자열 자료형**********");
		// String은 문자열을 다루는 문자이다
		String jdk = "jdk";
		System.out.println(jdk);
		int version = 21;
		String java = jdk + version;
		
		
		
		System.out.println(jdk);
		System.out.println(version);
		System.out.println(java);
		
		String cart = "라면";
		System.out.println(cart);
		// 배열
		String carts[] = {"라면", "빵", "우유", "생수"};
		System.out.println(carts[0]);
		System.out.println(carts[1]);
		System.out.println(carts[2]);
		System.out.println(carts[3]);
		
		
		
		
	}

}
