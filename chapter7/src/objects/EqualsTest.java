package objects;

public class EqualsTest {

	public static void main(String[] args) {
		//String 객체 생성
		String name1 = new String("강건마");
		String name2 = new String("강건마");
		// 메모리 주소 비교
		System.out.println(name1 == name2);
		
		//저장된 값을 비교
		System.out.println(name1.equals(name2));
		
		Book book1 = new Book(100,"채식주의자");
		Book book2 = new Book(100,"채식주의자");
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
	}

}
