package singleton.car;

public class Car {
	//static 변수 선언
	private static int serialNum = 1000;
	private int carNumber;
	
	//생성자
	public Car() {
		serialNum++;
		carNumber = serialNum;	
	}
	//접근자
	public int getCarNumber() {
		return carNumber;
	}
}
