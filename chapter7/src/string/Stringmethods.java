package string;

public class Stringmethods {

	public static void main(String[] args) {
		//charAt-문자열에서 1개의 문자만 추출
		//문자열은 특별한 1차원 배열이다.
		String msg = "행운을 빌어요";
		
		char ch = msg.charAt(0);
		char ch2 = msg.charAt(4);
		System.out.println(ch);
		System.out.println(ch);
		
		//주민등록 번호에서 남여를 구분
		String jumin = "020615-3321234";
		char gender = jumin.charAt(7);
		
		
		switch(gender){
		case'1':
		case'3':
			System.out.println("남자");
			break;
		case'2':
		case'4':
			System.out.println("여자");
			break;
			default:
				System.out.println("지원하지 않는 기능입니다.");
				break;
		}
		
		//substring(시작인덱스, 끝인덱스)- 여러개의 문자열 잘라내기(추출하기)
		//주민등록번호의 앞부분 firstNum, 뒤 -  secondNum
		String firstNum = jumin.substring(0, 6);
		System.out.println("생년월일: "+ firstNum);
		
		String secondNum = jumin.substring(7);
		System.out.println("주민번호 뒷자리: "+ secondNum);
		
		
	}

}
