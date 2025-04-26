package classes;
//얕은 복사
public class ObjectCopy {

	public static void main(String[] args) {
		
		//객체 생성
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		//객체 추가
		array1[0] =new Book(100, "채식주의자", "한강");
		array1[1] =new Book(101, "자바 ", "홍길동");
		array1[2] =new Book(102, "c언어", "이승찬");
		//객체 수정 - array1의 첫번쨰 요소
		array1[0].setBookTitle("미생");
		array1[0].setAuthor("윤태호");
		
		//향상된 포문
		System.out.println("------array1 출력-------");
		for(Book book : array1)
			book.showBookInfo();
		
		//array1을 array2에 복사
		for(int i = 0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println("------array2 출력-------");
		for(Book book : array2)
			book.showBookInfo();
		
		
	
	
	
	
	
	}

}
