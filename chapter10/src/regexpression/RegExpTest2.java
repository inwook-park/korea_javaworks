package regexpression;

public class RegExpTest2 {

	public static void main(String[] args) {
		//문자열 처리 함수(String 클래스) - replace(정규표현식, 대체기호)

		//비밀번호 보안 처리
		//영문자[a-z A-Z]나 숫자[0-9]가 아니면 '*'로 마스킹
		String password ="p@ssw@rd!";
		String masked = password.replaceAll("[^a-z-Z0-9]", "*");
		System.out.println(masked);
		
		//게시글 금칙어 처리
		String text = "안녕하세요! #스팸";
		//한글과 공백만 허용 - [ㄱ-힣][\s]
		String filterd = text.replaceAll("[^r-힣\s]", "*");
		System.out.println(filterd);
	}

}
