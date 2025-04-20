package polymorphism;

class Animal{
	public void move() {
		System.out.println("움직인다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람");
	}
}
class Horse extends Animal{
	public void move() {
		System.out.println("말");
}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리");
}

}
public class AnimalTest {
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		//부모타입 - 자식 타입(자동 형변환), 인케스팅
		//Animal human = new Human();
		//Animal horse = new horse();
		 
		//Human human = new Human();
		//Horse horse = new Horse();
		
		//human.move();
		//horse.move();
		
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Horse());
		aTest.moveAnimal(new Eagle());
	}
}
