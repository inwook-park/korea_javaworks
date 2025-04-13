package salestatement;

public class Drink {
	protected String name;
	protected int price;
	protected int quantity;
	
	Drink(String nameint, int priceint, int quantity){
		this.name = name;
		this.price =price;
		this.quantity = quantity;
	}
	int calcPrice() {
		return price * quantity;
		
	}
	static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	void printData() {
		System.out.println(name +"\t"+ price +"\t"+ quantity +"\t"+ calcPrice());
	}
	
	
	
	
	
	
	
	
	
}
