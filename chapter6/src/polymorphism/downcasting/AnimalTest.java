package polymorphism.downcasting;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두 발을 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		
		
		
		
		Animal animal= new Human();
		
		if (animal instanceof Human) {
			 Human human = (Human)animal;
			 human.readBook();
		 }
		
		
		
				
	}

}
