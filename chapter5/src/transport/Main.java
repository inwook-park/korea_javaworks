package transport;

public class Main {

	public static void main(String[] args) {
		//Person 객체 생성
		Person p1 = new Person("홍길동", 10000);
		Person p2 = new Person("김나무", 20000);
		//버스 객체
		Bus bus100 = new Bus(100);
		//버스 요금
		int feeOfBus = 1500;
		
		p1.takeBus(bus100, feeOfBus);
		p2.takeBus(bus100, feeOfBus);
		
		p1.personInfo();
		p2.personInfo();
		bus100.busInfo();
		
		
	}

}
