package abstract_class.car;

public class CarTest2 {

	public static void main(String[] args) {
		
		System.out.println("사람이 운전하는 자동차");
		CarRun(new HumanCar());
		
		System.out.println("자율 주행하는 자동차");
		CarRun(new AICar());
	}

	public static void CarRun(Car car) {
		car.run();
	}
}
