package Variable;

public class Variable {

	public static void main(String[] args) {
		
		//변수란 자료를 저장하기 위한 공간, 자료를 바꿀 수 있다.
		
		String name;
		int grade;
		
		name = "한강";
		grade = 2;
		int ban = 3; 
		
		System.out.println("이름:"+ name); // + 연산자 연결해준다
		System.out.println("학년:"+grade);
		System.out.println("반:"+ban);
		
		System.out.println(name + "은 " +grade + "학년 "+ban+"반입니다.");
		
		//변수 만들 때 주의 사항 
		// 숫자로 시작하면 X 1name X name O
		// 공백이 생기면 안된다. na  me X na_me O
		// 예약어 사용(자바에서 사용되는 키워드) X
		
		
		
		
		
	}

}
