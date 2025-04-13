package salestatement;

public class Main {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 2500, 4);
		Drink tea = new Drink("녹차", 3500, 4);
		Alcohol soju = new Alcohol("소주",4000, 2, 15.2f);
		
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		Alcohol.printTitle();
		soju.printData();
		
		int total = 0;
		total = coffee.calcPrice()+ tea.calcPrice() + soju.calcPrice();
		System.out.println("합계 금액: " + total + "원");
	}

}
