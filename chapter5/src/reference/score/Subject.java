package reference.score;

public class Subject {
	
	private String subjectName;//과목명
	private int scorePoint;
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
		
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public int getScorePoint() {
		return scorePoint;
	}
}
