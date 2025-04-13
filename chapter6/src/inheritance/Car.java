package inheritance;

public class Car {
	String brand;
	int year;
	Car(String brand,int year){
		
		this.brand = brand;
		this.year = year;
	}
		void carInfo() {
			System.out.println("모델명: "+ brand);
			System.out.println("연식: "+ year);
		}
}
