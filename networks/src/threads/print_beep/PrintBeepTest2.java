package threads.print_beep;

import java.awt.Toolkit;

public class PrintBeepTest2 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드가 동시에 실행
		Runnable beepTask = new BeepTask();
		//작업 스레드 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start();
		

		for(int i = 1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}
