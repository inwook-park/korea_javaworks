package reference.score2;

import reference.score.Subject;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();//과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		for(int i= 0; i<subjects.length; i++) {
			if(subjects[i] == null) {
			subjects[i] = subject;
			break;
			}
		}
	}
	
	//출력
	public void displayInfo() {
		int total = 0;
		int count = 0; 
		double avg;
		
		
		
		
		System.out.println("학번:"+ studentId+
				"\n이름:" + studentName);
		for(int i = 0; i<subjects.length; i++) {
			if(subjects[i] != null) {
				total += subjects[i].getScorePoint();//총점 계산
				count++; //개수 1 증가
			
				System.out.println(
						 subjects[i].getSubjectName()+
						"점수:" + subjects[i].getScorePoint());
				
				
			}
		}
		System.out.println("------------------------------");
		avg = (double)total/count;
		System.out.printf("평균 점수: %.1f점",avg);
		System.out.println();
		System.out.println("------------------------------");
	}
}
