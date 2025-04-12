package classes;

public class BookTest {

	
	  public static void main(String[] args) {
	
		//book 객체 배열 생성
		  /*Book[] books = new Book[3];
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		
		//원소 추가(저장)
		books[0] = new Book(100, "채식주의자", "한강");
		books[1] = new Book(101, "자바 입문", "홍길동");
		books[2] = new Book(102, "만화책", "이승찬");*/
		
	
		Book[] books = {
				new Book(100, "채식주의자", "한강"),	
				new Book(101, "자바 ", "홍길동"),
				new Book(102, "c언어", "이승찬")
		};
	
	
	
	
		//원소 출력
		for(int i = 0; i < books.length; i++) {
		books[i].showBookInfo();
		}
	}

}
