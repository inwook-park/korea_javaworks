package thissample;

//private를 생략하면 default로 public과 유사
class BirthDay{
	int year;
	int month;
	int day;
	
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
	
	
}



public class BirthDayTest {

	public static void main(String[] args) {
		// 
		BirthDay Dday = new BirthDay();
		Dday.setYear(2000);
		
		System.out.println(Dday);
		Dday.printThis();
		
		
	}

}
