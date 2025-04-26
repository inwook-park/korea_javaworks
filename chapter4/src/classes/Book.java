package classes;

public class Book {
	private int bookNumber;//책 번호 
	private String bookTitle;//책 제목
	private String author;//작가
	//기본 생성자
	public Book() {}
	//생성자
	public Book(int bookNUmber, String bookTitle, String Author) {
		this.bookNumber = bookNUmber;
		this.bookTitle = bookTitle;
		this.author = Author;
	}
	
	//설정자 메서드(setter)
	public void setBookNumber(int booknumber) {
		this.bookNumber = booknumber;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
  public void showBookInfo() {
	  System.out.println(bookNumber + ": " +bookTitle +","+ author);
  }
  
}
