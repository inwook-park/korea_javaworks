package interfaces.bookshelf;
//책을 저장할 선반 클래스 정의

import java.util.ArrayList;

public class Shelf {

	 ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
}
