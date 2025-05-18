package interfaces.bookshelf;
//Queue자료 구조 -선입선출
//구현시에 arraylist 사용
public interface Queue {
	
	void enQueue(String title);
	
	String deQueue();
	
	int getSize();
	
}
