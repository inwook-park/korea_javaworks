package reference.score2;

public class Main {

	public static void main(String[] args) {
		
		//객체 생성
		Student lee = new Student(1001,"이정후");
		Student shin = new Student(1002,"신유빈");
		//과목 추가
		lee.addSubject("국어", 90);
		lee.addSubject("수학", 70);
		lee.addSubject("과학", 80);
		
		shin.addSubject("국어", 100);
		shin.addSubject("수학", 90);
		shin.addSubject("과학", 80);
		//출력
		lee.displayInfo();
		shin.displayInfo();
		
		
	}

}
