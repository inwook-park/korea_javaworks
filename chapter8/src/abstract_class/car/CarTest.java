package abstract_class.car;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("사람이 운전하는 자동차");
		Car hisCar = new HumanCar();
		hisCar.run();
		/*hisCar.startCar();
		hisCar.drive();
		hisCar.stop();
		hisCar.turnoff();*/
		System.out.println("자율 주행하는 자동차");
		Car myCar = new AICar();
		myCar.run();
		/*myCar.startCar();
		myCar.drive();
		myCar.stop();
		myCar.turnoff();*/
	}

}
