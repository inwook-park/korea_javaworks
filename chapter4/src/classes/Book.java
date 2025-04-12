package classes;

public class Book {
	private int bookNUmber;//책 번호 
	private String bookTitle;//책 제목
	private String author;//작가
	
	public Book(int bookNUmber, String bookTitle, String Author) {
		this.bookNUmber = bookNUmber;
		this.bookTitle = bookTitle;
		this.author = Author;
	}
  public void showBookInfo() {
	  System.out.println(bookNUmber + ":" +bookTitle +":"+ author);
  }
  
}
