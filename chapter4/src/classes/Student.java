package classes;
/*
 * 클래스 정의
 * 클래스의 구성 요소 - 멤버 변수, 생성자, 멤버 메서드
 * 
 */
public class Student {
		//멤버 정의(속성)
	int studentID;
	String name;
	int grade;
	//기본 생성자-클래스와 이름은 갖고 변환값은 없음
	//생략하면 컴파일러가 자동으로 포함시켜준다.
	//생성자 오러로딩(중복) - 이름이 같고 매개 변수가 다름을 말함
	public Student() {};
	
	public Student(int id, String n, int g) {
		studentID = id;
		name = n;
		grade =g; 
		
		
	};
	
	
	
	
	
	// 멤버 메서드
	public void Studentinfo() {
		System.out.println("학번: "+studentID);
		System.out.println("이름: "+name);
		System.out.println("학년: "+grade);
		System.out.println();
		
		
		
	}
	
	
	
}
