package classes;

public class StudentTest {

	public static void main(String[] args) {
		//클래스에 객체 생성
		Student s1 = new Student(1000,"이정후",2); //객체 생성
		Student s2 = new Student(2000,"신유빈", 3);
		
		
		
		s1.Studentinfo();
		s2.Studentinfo();
		
		
		//객체 출력
		//클래스 이름 : 패키지이름, 클래스이름
		
		//System.out.println(s1);
		//System.out.println(s2);
	}
}
