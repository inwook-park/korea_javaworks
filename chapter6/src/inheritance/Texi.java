package inheritance;

public class Texi extends Car{
	int passenger;
	
	Texi(String brand, int year, int passenger){
		super(brand, year);
		this.passenger = passenger;
	}
	/*void carInfo(){
		System.out.println("모델명: "+ brand);
		System.out.println("연식: "+ year);
		System.out.println("승객수: "+ passenger);
	}
	*/

	@Override
	void carInfo() {
		// TODO Auto-generated method stub
		super.carInfo();
		System.out.println("승객수: "+ passenger);
	}
	
	
}
