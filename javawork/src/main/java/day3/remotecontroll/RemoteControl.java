package day3.remotecontroll;

/*
 * 인터페이스 = 상수 + 추상메서드
 */
public interface RemoteControl {
	
	//상수(final)
	public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    
	//추상메서드 [public abstract] 생략가능
    public abstract void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
