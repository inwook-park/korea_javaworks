package interfaces.remote_control;

public interface RemoteControl {
	//인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
