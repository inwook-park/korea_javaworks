package threads;

public class ThreadNameTest {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행"); 

		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			} 
		
		};
		threadA.start();
	
		//작업 스레드 이름 변경 - setname()
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println("chatthread 이름: " + getName() + " 실행");
			}
			
			
		};
		chatThread.setName("chat-thread");
		chatThread.start();
		
	}
}