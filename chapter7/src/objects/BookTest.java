package objects;

public class BookTest {

	public static void main(String[] args) {
		String name = new String("한강");
		System.out.println(name);
		System.out.println(name.toString());
		Book book = new Book(100, "채식주의자");

		System.out.println(book);
		System.out.println(book.toString());
	}

}
