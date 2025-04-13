package statics;

public class Car {
	private static int serialNum = 10000;
	private int carNumber;
	
	 public Car() {
		 serialNum++;
		 carNumber = serialNum;
	 }
	public void setCarNumber(int carNumber) {
		this.carNumber= carNumber;
	}
	
	 
	
	
	 public int getCarNumber() {

		return carNumber;
		 
		//getCarNumber
	
	
	
	 }
}
