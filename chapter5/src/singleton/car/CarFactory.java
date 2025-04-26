package singleton.car;

public class CarFactory {
 //싱글톤 패턴으로 CarFactory 클래스 작선
	private static CarFactory instance;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	
	public Car createCar() {
		
		Car car = new Car();
		return car;
	}
	
}
