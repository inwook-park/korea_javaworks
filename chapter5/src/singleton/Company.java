package singleton;

public class Company {
	
	private static Company instance;
	//생성자
	private Company() {}
	//getInstance()메서드 정의
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
	
}
