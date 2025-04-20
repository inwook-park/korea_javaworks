package reference.score;

public class ScoreMain {

	public static void main(String[] args) {
		//학생 객체 생성
		Student lee = new Student(1001, "이정후");
		Student shin = new Student(1002, "신유빈");
		//Student hong = new Student(1003,"홍길동");
		
		
		//과목 설정
		lee.setKoreanSubject("국어", 90);
		lee.setMathSubject("수학", 80);
		
		shin.setKoreanSubject("국어", 70);
		shin.setMathSubject("수학", 50);
		
		//hong.setKoreanSubject("국어", 0);
		//hong.setMathSubject("수학", 0);
		//출력
		lee.showStudentInfo();
		shin.showStudentInfo();
		//hong.showStudentInfo();
		
		
		
		
		
		
	}

}
