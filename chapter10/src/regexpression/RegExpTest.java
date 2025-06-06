package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		// 
		Pattern pat = Pattern.compile("a+b");
		Matcher mat = pat.matcher("aaab");
		boolean result = mat.matches();
		
		System.out.println(result);
		
		
		//숫자만 허용하는 패턴
		String pattern = "^[0-9]*$";
		String str = "1234";
		boolean result2 = Pattern.matches(pattern, str);
		System.out.println(result2);
		
		//한글 전화번호 패턴
		String name = "제갈수현";
		String tel = "010-1234-5678";
		boolean name_check = Pattern.matches("^[가-힣]{2,5}$", name);
		boolean tel_check = Pattern.matches("010[-](\\d{3}|\\d{4})[-]\\d{4}$", tel);
		
		System.out.println("이름 검사: " + name_check);
		
		//한글 이름 패턴 유효성 검사
		Scanner sc = new Scanner(System.in);
		System.out.println("한글 이름을 입력해주세요: ");
		String inputName = sc.nextLine();
		
		if (!Pattern.matches("[가-힣]{2,5}", inputName)) {
			System.out.println("올바른 한글 이름이 아닙니다!");
		}
		System.out.println("이름: " + inputName);
		
		sc.close();
		
		
	}

}
