package transport;

public class Bus {
//버스 번호, 승객수 , 버스의 수입
	private int busNumber;
	private int passenger;
	private int money;
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	public void take(int money) {
		this.money += money; 
		passenger++;
	}
	
	public void busInfo() {
		System.out.println(busNumber+ "번 버스의 수입은 " + money + "원이고, 승객은 " + passenger + "명 입니다." );
	}
}
