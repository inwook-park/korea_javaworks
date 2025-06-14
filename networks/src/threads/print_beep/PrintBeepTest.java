package threads.print_beep;

import java.awt.Toolkit;

public class PrintBeepTest {

	public static void main(String[] args) {
		//띵이라는 문자열 5번 출력
		for(int i = 1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		//띵 소리 5번 재생
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
