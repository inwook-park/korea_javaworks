package collecttion.queue;

import java.util.ArrayList;

//문자열을 저장할 큐 구조 구현 클래스 정의
public class MyQueue {
	
	private ArrayList<String> arrayQueue;
	
	public MyQueue() {
		arrayQueue = new ArrayList<>();
	}
	//요소 추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	//요소 삭제
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다");
		return null;
		}
		
		
		return arrayQueue.remove(0);
	}
	
}
