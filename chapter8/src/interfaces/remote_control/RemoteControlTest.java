package interfaces.remote_control;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12);
		rcTV.turnOff();

		

	}

}
