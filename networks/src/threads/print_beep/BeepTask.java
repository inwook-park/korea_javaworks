package threads.print_beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
