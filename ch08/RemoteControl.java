package ch08;

public interface RemoteControl {
	//상수필드 -해당 인터페이스 뒤에 들어오는 객페들이 사용할 고정값
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//추상메소드-해당 인터페이스 뒤에 들어오는 객체들이 가지는 정형화 되어있는 메소드 목록
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	//디폴트메소드 -접근제한자의 default와 다른의미/// 해당 인터페이스 뒤에 들어오는 모든 객체들이 가지는 공통적인 동작 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거입니다");
		}else {
			System.out.println("음소거 해제합니다");
		}
	}
	//정적메소드 -해당 인터페이스 자체가 가지는 동작 의미
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
	
	
}
